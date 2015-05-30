$(document).ready(function () {

    var ContactId = ""
    if (GetQueryString("userId")) {
        UserId = GetQueryString("userId");
    }
    if (GetQueryString("pid")) {
        ContactId = GetQueryString("pid");
    }
    if (GetQueryString("action") == "add") {
        $(".btnAdd").css("display", "block");
    } else {
        var getDataStatus = "0";
        var result;
        $.ajax({
            //url 数据获取的目标地址
            url: "http: //110.249.163.146:8082/getListByAid",
            type: "GET",
            data: {
                aid: UserId,
                pid: ContactId
            },
            contentType: "application/json",
            dataType: "json",
            success: function (dataResult) {
                /*//Data 标准格式
                var data = {
                    status: 0,
                    msg: "",
                    data: {
                    }
                }*/

                //返回状态正常执行True，状态异常执行False
                if (dataResult.status == "0") {
                    if (typeof (dataResult.data) == "string") {
                        result = data;
                        ////如果从服务器端接收到的是字符串类型的JSON并不是JSON类型,则需要执行ParseJson方法
                        ////将数据转成Json对象
                        ////var result = ParseJson(data);
                    } else if (typeof (dataResult.data) == "object") {
                        //当data是数组时执行True,是Json时执行False
                        if (dataResult.data instanceof Array) {

                        } else {
                            result = data;
                        }
                    }
                } else {
                    getDataStatus = "1";
                    alert(dataResult.msg);
                }
            }
        });
        $("#ContactId").val(ContactId);
        var pName = "";
        var pIdCard = "";
        var pPhone = "";

        $(data).each(function (key) {
            pIdCard = data[key][idcard];
            pName = data[key][name];
            pPhone = data[key][valcellphoneue];
        });
        $("#ContactName").val(pName);
        $("#ContactIdCard").val(pIdCard);
        $("#ContactPhone").val(pPhone);
        $(".btnModify").css("display", "block");
        $(".btnDelete").css("display", "block");
    }
});


//添加患者
function AddContact() {
    var ContactName = $("#ContactName").val();
    var ContactIdCard = $("#ContactIdCard").val();
    var ContactPhone = $("#ContactPhone").val();
    var NewContact = {
        "name": ContactName,
        "idcard": ContactIdCard,
        "cellphone": ContactPhone
    };
    var param = JSON.stringify(NewContact);
    NewContact = {
        "pinfo": param
    };
    /*alert(NewContact);*/
    Validata(document.getElementById("ContactIdCard"));
    if (ContactName != "" || ContactIdCard != "" || ContactPhone != "") {
        $.ajax({
            url: "http://110.249.163.146:8082/regiserPatient",
            data: NewContact,
            type: "Get",
            dataType: 'json',
            success: function (msg) {
                if (msg.status == 0) {
                    alert(msg.data);
                    window.history.back();
                } else {
                    //console.log('添加失败')
                }
            }
        });
    } else {
        $(".FormError").css("display", "block");
    }
}

//删除患者
function DeleteContact() {
    var ContactId = $("#ContactId").val;
    $.ajax({
        url: "",
        data: ContactId,
        type: "GET",
        dataType: 'text',
        success: function (msg) {
            if (msg == '1') {
                window.location = "Contacts.html";
            } else {
                //console.log('删除失败')
            }
        }
    });
}

//修改患者信息
function ModifyContact() {
    var ContactId = $("#ContactId").val;
    var ContactName = $("#ContactName").val();
    var ContactIdCard = $("#ContactIdCard").val();
    var ContactPhone = $("#ContactPhone").val();
    var NewContact = {
        "ContactId": ContactId,
        "ContactName": ContactName,
        "ContactIdCard": ContactIdCard,
        "ContactPhone": ContactPhone
    };
    Validata(document.getElementById("ContactIdCard"));
    if (ContactName != "" || ContactIdCard != "" || ContactPhone != "") {
        $.ajax({
            url: "",
            data: NewContact,
            type: "GET",
            dataType: 'text',
            success: function (msg) {
                if (msg == '1') {
                    //console.log('修改成功');
                } else {
                    //console.log('修改失败')
                }
            }
        });
    } else {
        $(".FormError").css("display", "block");
    }
}


//获取URL参数
function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}
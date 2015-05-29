$(document).ready(function () {
    var getDataStatus = "0";
    var result;
    $.ajax({
        //url 数据获取的目标地址
        url: "",
        type: "GET",
        data: {
            parameterName1: "parameterValue1",
            parameterName2: "parameterValue2"
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

    result = {
        "status": "0",
        "msg": "sucess",
        "data": [{
            id: "111",
            name: "dfjak",
            cellphone: "1818181818",
            idcard: "29348388384"
}]
    };

    //如果返回状态正常获取数据并操作
    if (getDataStatus == "0") {
        var suffererList = $("#SufferersList");
        //获取Sufferer数据填充下拉列表
        FillSelectData(suffererList, result, "data", "id", "name");
        //通过隐藏域取值
        $(suffererList).change(function () {
            //取得选中的文本值
            var selectText = $(this).find("option:selected").text();
            $("#suffererCurr").attr("data-value", selectText);
            //获取选中的value值
            var selectVlaue = $(this).find("option:selected").val();
            $("#suffererCurr").attr("data-key", selectVlaue);
        });
    }

    /*//患者列表测试数据结构
    var SuffererListResult = {
        "sufferers": [{
                "SuffererId": "1",
                "SuffererName": "阿呆",
                "SuffererPhone": "15012345671",
                "SuffererIdCard": "123456789014785236"
                    }
                        , {
                "SuffererId": "2",
                "SuffererName": "阿瓜",
                "SuffererPhone": "15012345671",
                "SuffererIdCard": "123456789014785236"

                    }
                        , {
                "SuffererId": "3",
                "SuffererName": "阿国",
                "SuffererPhone": "15012345671",
                "SuffererIdCard": "123456789014785236"
                    }]
    };

    var suffererList = $("#SufferersList");
    //获取Sufferer数据填充下拉列表
    FillSelectData(suffererList, SuffererListResult, "sufferers", "SuffererId", "SuffererName");
    //通过隐藏域取值
    $(suffererList).change(function () {
        //取得选中的文本值
        var selectText = $(this).find("option:selected").text();
        $("#suffererCurr").attr("data-value", selectText);
        //获取选中的value值
        var selectVlaue = $(this).find("option:selected").val();
        $("#suffererCurr").attr("data-key", selectVlaue);
    });

    //科室列表一级菜单测试数据结构
    var DepartmentListResult = {
        "Departments": [{
                "DepartmentId": "1",
                "DepartmentName": "非手术科"
                    }
                        , {
                "DepartmentId": "2",
                "DepartmentName": "手术科"
                    }
                        , {
                "DepartmentId": "3",
                "DepartmentName": "其他科室"
                    }]
    };

    var departmentList = $("#DepartmentList");
    //填充下拉列表数据（select id,数据源，json指定对象，key，value）
    FillSelectData(departmentList, DepartmentListResult, "Departments", "DepartmentId", "DepartmentName");
    //通过隐藏域取值
    $(departmentList).change(function () {
        //取得选中的文本值
        var selectText = $(this).find("option:selected").text();
        $("#departmentCurr").attr("data-value", selectText);
        //获取选中的value值
        var selectVlaue = $(this).find("option:selected").val();
        $("#departmentCurr").attr("data-key", selectVlaue);
    });

    var contactList = $("#ContactList");
    GetContactsList(contactList, SuffererListResult, "sufferers", "SuffererName", "SuffererPhone", "SuffererId");*/


});

//填充下拉列表数据（select id,数据源，json指定对象，key，value）
function FillSelectData(listid, data, object, value, text) {
    //清空Select ListItem
    RemoveOption(listid);

    //添加默认节点
    listid.append("<option value='-1'>--请选择--</option>");

    var displayText = "";
    var SelectValue = "";

    $(data[object]).each(function (key) {
        displayText = data[object][key][text];
        SelectValue = data[object][key][value];
        AppendOption($(listid), SelectValue, displayText);
    });
}


//清空Select ListItem
function RemoveOption(ListId) {
    $(ListId).find("option").remove();
}

//给指定的 Select 添加键值
function AppendOption(ListId, value, displayText) {
    ListId.append("<option value='" + value + "'>" + displayText + "</option>");
}

//提交挂号页面表单
function SaveData() {
    var suffererId = $("#suffererCurr").attr("data-key");
    var departmentId = $("#departmentCurr").attr("data-key");
    $.ajax({
        //url 将数据提交给服务器端
        url: "",
        type: "GET",
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            $(".Success").css("display", "block");
        }
    });

}


//患者列表
function GetContactsList(listid, data, object, name, phone, suffererid) {
        //清空Contacts ListItem
        RemoveContacts(listid);

        var ContactName = "";
        var ContactPhone = "";
        $(data[object]).each(function (key) {
            //添加联系人
            ContactName = data[object][key][name];
            ContactPhone = data[object][key][phone];
            listid.append("<li><a href='ContactDetail.html?ContactId=" + data[object][key][suffererid] + "&action=view'><span class='ContactName'>" + ContactName + "</span><span class='ContactPhone'>" + ContactPhone + "</span></a></li>");
        });
    }

//清空患者列表
function RemoveContacts(listid) {
    $(listid).find("li").remove();
}

//将Json转换成对象
function ParseJson(data) {
    return (new Function("", "return " + data))();
}
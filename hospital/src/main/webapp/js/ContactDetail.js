$(document).ready(function () {

    var ContactId = ""
    if (GetQueryString("ContactId")) {
        ContactId = GetQueryString("ContactId");
    }
    if (GetQueryString("action") == "add") {
        $(".btnAdd").css("display", "block");
    } else {
        $("#ContactId").val(ContactId);
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
        "ContactName": ContactName,
        "ContactIdCard": ContactIdCard,
        "ContactPhone": ContactPhone
    };

    if (ContactName != "" || ContactIdCard != "" || ContactPhone != "") {
        $.ajax({
            url: "",
            data: NewContact,
            type: "Post",
            dataType: 'text',
            success: function (msg) {
                if (msg == '1') {
                    //console.log('添加成功');
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
        type: "Post",
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

    if (ContactName != "" || ContactIdCard != "" || ContactPhone != "") {
        $.ajax({
            url: "",
            data: NewContact,
            type: "Post",
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
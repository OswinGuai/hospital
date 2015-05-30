$(document).ready(function () {
    var getDataStatus = 0;
    var result;
    if (GetQueryString("userId")) {
        UserId = GetQueryString("userId");
    }
    $.ajax({
        //url 数据获取的目标地址
        url: "getListByAid",
        type: "GET",
        data: {
            aid: UserId
        },
        contentType: "application/json",
        dataType: "json",
        success: function (dataResult) {
            //返回状态正常执行True，状态异常执行False
            if (dataResult.status == 0) {
                if (typeof (dataResult.data) == "string") {
                    result = dataResult.data;
                    ////如果从服务器端接收到的是字符串类型的JSON并不是JSON类型,则需要执行ParseJson方法
                    ////将数据转成Json对象
                    ////var result = ParseJson(data);
                } else if (typeof (dataResult.data) == "object") {
                    //当data是数组时执行True,是Json时执行False
                    if (dataResult.data instanceof Array) {
                        result = dataResult.data;
                    } else {
                        result = dataResult.data;
                    }
                }
                GetContactsList($("#ContactList"), result, "name", "idcard", "id");
            } else {
                getDataStatus = 1;
                alert(dataResult.msg);
            }
        }
    });
});

//患者列表
function GetContactsList(listid, data, name, IdCard, id) {
    //清空Contacts ListItem
    RemoveContacts(listid);

    var ContactName = "";
    var ContactPhone = "";
    $(data).each(function (key) {
        //添加联系人
        ContactName = data[key][name];
        ContactIdCard = data[key][IdCard];
        listid.append("<li><a href='ContactDetail.html?ContactId=" + data[key][id] + "&action=view'><span class='ContactName'>" + ContactName + "</span><span class='ContactIdCard'>" + ContactIdCard.substring(0, 4) + "****" + ContactIdCard.substring(ContactIdCard.length - 4, ContactIdCard.length) + "</span></a></li>");
    });
}

//获取URL参数
function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}
$(document).ready(function () {
    /*    $.ajax({
            //url 数据获取的目标地址
            url: "",
            type: "Post",
            contentType: "application/json",
            dataType: "json",
            success: function (data) {

                //获取目标填充下拉列表
                var suffererList = $("SufferersList");
                
                ////如果从服务器端接收到的是字符串并不是JSON,则需要执行ParseJson方法
                ////将数据转成Json对象
                ////var result = ParseJson(data);
                result = data;
                //清空Select ListItem
                RemoveOption(suffererList);

                //添加默认节点
                suffererList.append("<option value='-1'>--请选择患者--</option>");

                var suffererName = "";
                var suffererId = "";
                $(result.sufferers).each(function (key) {
                    suffererName = result.sufferers[key].SuffererName;
                    suffererId = result.sufferers[key].SuffererId;
                    AppendOption($("#SufferersList"), suffererId, suffererName);
                });
            }
        });*/

    //患者列表测试数据结构
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
    GetContactsList(contactList, SuffererListResult, "sufferers", "SuffererName", "SuffererPhone", "SuffererId");


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
        type: "Post",
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
function ParseJson(data){
    return (new Function("","return " + data))();
}
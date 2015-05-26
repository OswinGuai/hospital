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
                //将数据转成Json对象
                var result = (new Function("", "return " + data));

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
                "SuffererName": "阿呆"
                    }
                        , {
                "SuffererId": "2",
                "SuffererName": "阿瓜"
                    }
                        , {
                "SuffererId": "3",
                "SuffererName": "阿国"
                    }]
    };
    //获取目标填充下拉列表
    var suffererList = $("#SufferersList");
    var dataArray = new Array();
    
    dataArray = ["sufferers","SuffererId","SuffererName"];
    FillData(suffererList,SuffererListResult,dataArray)

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


});

function FillData(ListId,data,dataArray){
      //清空Select ListItem
    RemoveOption(ListId);

    //添加默认节点
    ListId.append("<option value='-1'>--请选择患者--</option>");

    var name = "";
    var id = "";
    var array = new Array(3);
    array.concat(dataArray);
    
    
    $(data.array[0]).each(function (key) {
        name = data.dataArray[key].dataArray[2];
        id = data.dataArray[key].dataArray[1];
        AppendOption($("#SufferersList"), id, name);
    });

    //通过隐藏域取值
    $("#SufferersList").change(function () {
        //取得选中的文本值
        var selectText = $(this).find("option:selected").text();
        $("#suffererCurr").attr("data-value", selectText);
        //获取选中的value值
        var selectVlaue = $(this).find("option:selected").val();
        $("#suffererCurr").attr("data-key", selectVlaue);
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
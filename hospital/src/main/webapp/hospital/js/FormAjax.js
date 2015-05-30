$(document).ready(function () {
    var getDataStatus = 0;
    var result;
    if (GetQueryString("userId")) {
        UserId = GetQueryString("userId");
    }
    $.ajax({
        //url 数据获取的目标地址
        url: "backend/getListByAid",
        type: "GET",
        data: {
            aid: UserId
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
                //如果返回状态正常获取数据并操作
                var suffererList = $("#SufferersList");
                //获取Sufferer数据填充下拉列表
                FillSelectData(suffererList, result, "aid", "name");
                //通过隐藏域取值
                $(suffererList).change(function () {
                    //取得选中的文本值
                    var selectText = $(this).find("option:selected").text();
                    $("#suffererCurr").attr("data-value", selectText);
                    //获取选中的value值
                    var selectVlaue = $(this).find("option:selected").val();
                    $("#suffererCurr").attr("data-key", selectVlaue);
                });
            } else {
                getDataStatus = 1;
                alert(dataResult.msg);
            }
        }
    });
    /*result = {
        "status": "0",
        "msg": "sucess",
        "data": [{
            id: "111",
            name: "dfjak",
            cellphone: "1818181818",
            idcard: "29348388384"
    }]
    };*/

    $.ajax({
        //url 数据获取的目标地址
        url: "backend/rootTypes",
        type: "GET",
        data: {
            aid: UserId
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
                //如果返回状态正常获取数据并操作
                var departmentList = $("#DepartmentList");
                //获取Sufferer数据填充下拉列表
                FillSelectData(departmentList, result, "id", "typeName");
                //通过隐藏域取值
                $(departmentList).change(function () {
                    //取得选中的文本值
                    var selectText = $(this).find("option:selected").text();
                    $("#departmentCurr").attr("data-value", selectText);
                    //获取选中的value值
                    var selectValue = $(this).find("option:selected").val();
                    $("#departmentCurr").attr("data-key", selectVlaue);
                    $.ajax({
                        //url 数据获取的目标地址
                        url: "backend/subTypes",
                        type: "GET",
                        data: {
                            aid: UserId,
                            parentId: selectValue
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
                                //如果返回状态正常获取数据并操作
                                var sectionList = $("#SectionList");
                                //获取Sufferer数据填充下拉列表
                                FillSelectData(sectionList, result, "id", "typeName");
                                //通过隐藏域取值
                                $(sectionList).change(function () {
                                    //取得选中的文本值
                                    var selectText = $(this).find("option:selected").text();
                                    $("#SectionCurr").attr("data-value", selectText);
                                    //获取选中的value值
                                    var selectVlaue = $(this).find("option:selected").val();
                                    $("#SectionCurr").attr("data-key", selectVlaue);
                                });
                            } else {
                                getDataStatus = 1;
                                alert(dataResult.msg);
                            }
                        }
                    });

                });
            } else {
                getDataStatus = 1;
                alert(dataResult.msg);
            }
        }
    });

});

var CheckIdCard = {
    //Wi 加权因子 Xi 余数0~10对应的校验码 Pi省份代码
    Wi: [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2],
    Xi: [1, 0, "X", 9, 8, 7, 6, 5, 4, 3, 2],
    Pi: [11, 12, 13, 14, 15, 21, 22, 23, 31, 32, 33, 34, 35, 36, 37, 41, 42, 43, 44, 45, 46, 50, 51, 52, 53, 54, 61, 62, 63, 64, 65, 71, 81, 82, 91],

    //检验18位身份证号码出生日期是否有效
    //parseFloat过滤前导零，年份必需大于等于1900且小于等于当前年份，用Date()对象判断日期是否有效。
    brithday18: function (sIdCard) {
        var year = parseFloat(sIdCard.substr(6, 4));
        var month = parseFloat(sIdCard.substr(10, 2));
        var day = parseFloat(sIdCard.substr(12, 2));
        var checkDay = new Date(year, month - 1, day);
        var nowDay = new Date();
        if (1900 <= year && year <= nowDay.getFullYear() && month == (checkDay.getMonth() + 1) && day == checkDay.getDate()) {
            return true;
        };
    },

    //检验15位身份证号码出生日期是否有效
    brithday15: function (sIdCard) {
        var year = parseFloat(sIdCard.substr(6, 2));
        var month = parseFloat(sIdCard.substr(8, 2));
        var day = parseFloat(sIdCard.substr(10, 2));
        var checkDay = new Date(year, month - 1, day);
        if (month == (checkDay.getMonth() + 1) && day == checkDay.getDate()) {
            return true;
        };
    },

    //检验校验码是否有效
    validate: function (sIdCard) {
        var aIdCard = sIdCard.split("");
        var sum = 0;
        for (var i = 0; i < CheckIdCard.Wi.length; i++) {
            sum += CheckIdCard.Wi[i] * aIdCard[i]; //线性加权求和
        };
        var index = sum % 11; //求模，可能为0~10,可求对应的校验码是否于身份证的校验码匹配
        if (CheckIdCard.Xi[index] == aIdCard[17].toUpperCase()) {
            return true;
        };
    },

    //检验输入的省份编码是否有效
    province: function (sIdCard) {
        var p2 = sIdCard.substr(0, 2);
        for (var i = 0; i < CheckIdCard.Pi.length; i++) {
            if (CheckIdCard.Pi[i] == p2) {
                return true;
            };
        };
    }
};

function Validata(obj) {
    var sIdCard = obj.value.replace(/^\s+|\s+$/g, ""); //去除字符串的前后空格，允许用户不小心输入前后空格
    if (sIdCard.match(/^\d{14,17}(\d|X)$/gi) == null) { //判断是否全为18或15位数字，最后一位可以是大小写字母X
        alert("身份证号码须为18位或15位数字"); //允许用户输入大小写X代替罗马数字的Ⅹ
    } else if (sIdCard.length == 18) {
        if (CheckIdCard.province(sIdCard) && CheckIdCard.brithday18(sIdCard) && CheckIdCard.validate(sIdCard)) {
            alert("身份证号码合法");
        } else {
            alert("请输入有效的身份证号码");
        };
    } else if (sIdCard.length == 15) {
        if (CheckIdCard.province(sIdCard) && CheckIdCard.brithday15(sIdCard)) {
            alert("身份证号码合法");
        } else {
            alert("请输入有效的身份证号码");
        };
    };
};


//填充下拉列表数据（select id,数据源，json指定对象，key，value,默认值）
function FillSelectData(listid, data, value, text) {
    //清空Select ListItem
    RemoveOption(listid);

    /*    //添加默认节点
        listid.append("<option value='-1'>--请选择--</option>");*/

    var displayText = "";
    var SelectValue = "";
    $(data).each(function (key) {
        var defaultSelectId = "";
        displayText = data[key][text];
        SelectValue = data[key][value];
        if (key == 0) {
            defaultSelectId = SelectValue;
        }
        AppendOption($(listid), SelectValue, displayText, defaultSelectId);
    });
}


//清空Select ListItem
function RemoveOption(ListId) {
    $(ListId).find("option").remove();
}

//给指定的 Select 添加键值
function AppendOption(ListId, value, displayText, defaultSelectId) {
    if (value == defaultSelectId && ListId.Attr("id") == "DepartmentList") {
        ListId.append("<option selected='selected' value='" + value + "'>" + displayText + "</option>");
    } else {
        ListId.append("<option value='" + value + "'>" + displayText + "</option>");
    }

}

//提交挂号页面表单
function SaveData() {
    var suffererId = $("#suffererCurr").attr("data-key");
    var departmentId = $("#departmentCurr").attr("data-key");
    var sectionId = $("#SectionCurr").attr("data-key");
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


//清空患者列表
function RemoveContacts(listid) {
    $(listid).find("li").remove();
}

//将Json转换成对象
function ParseJson(data) {
    return (new Function("", "return " + data))();
}

//获取URL参数
function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}
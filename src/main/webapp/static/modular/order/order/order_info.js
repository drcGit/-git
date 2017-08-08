/**
 * 初始化订单详情对话框
 */
var OrderInfoDlg = {
    orderInfoData : {},
    validateFields: {
        name: {
            validators: {
                notEmpty: {
                    message: '名称不能为空'
                }
            }
        }
    }
};


/**
 * 验证数据是否为空
 */
OrderInfoDlg.validate = function () {
	// 重置校验过的内容
    $('#orderInfoForm').data("bootstrapValidator").resetForm();
    // 开始验证
    $('#orderInfoForm').bootstrapValidator('validate');
    //返回验证结果
    return $("#orderInfoForm").data('bootstrapValidator').isValid();
};


/**
 * 清除数据
 */
OrderInfoDlg.clearData = function() {
    this.orderInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
OrderInfoDlg.set = function(key, val) {
    this.orderInfoData[key] = (typeof value == "undefined") ? $("#" + key).val() : value;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
OrderInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
OrderInfoDlg.close = function() {
    parent.layer.close(window.parent.Order.layerIndex);
}

/**
 * 收集数据
 */
OrderInfoDlg.collectData = function() {
    this.set('name').set('id').set('createAt').set('avatar');
}

/**
 * 提交添加
 */
OrderInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();
    if (!this.validate()) {
        return;
    }
    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/order/add", function(data){
        Feng.success("添加成功!");
        window.parent.Order.table.refresh();
        OrderInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    
    ajax.set(this.orderInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
OrderInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();
    
    if (!this.validate()) {
        return;
    }
    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/order/update", function(data){
        Feng.success("修改成功!");
        window.parent.Order.table.refresh();
        OrderInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.orderInfoData);
    ajax.start();
}

$(function() {
	Feng.initValidator("orderInfoForm", OrderInfoDlg.validateFields);
	 // 初始化头像上传
    var avatarUp = new $WebUpload("avatar");
    avatarUp.setUploadBarId("progressBar");
    avatarUp.init();
});

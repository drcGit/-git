package com.stylefeng.guns.modular.order.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.common.annotion.Permission;
import com.stylefeng.guns.common.annotion.log.BussinessLog;
import com.stylefeng.guns.common.constant.Dict;
import com.stylefeng.guns.common.constant.factory.PageFactory;
import com.stylefeng.guns.common.controller.BaseController;
import com.stylefeng.guns.common.exception.BizExceptionEnum;
import com.stylefeng.guns.common.exception.BussinessException;
import com.stylefeng.guns.common.persistence.model.Orders;
import com.stylefeng.guns.config.properties.GunsProperties;
import com.stylefeng.guns.core.log.LogObjectHolder;
import com.stylefeng.guns.modular.order.dao.OrderDao;
import com.stylefeng.guns.modular.order.service.IOrderService;

/**
 * 订单控制器
 *
 * @author fengshuonan
 * @Date 2017-07-18 12:47:43
 */
@Api(tags = "order", value="订单管理")
@Controller
@RequestMapping("/order")
public class OrderController extends BaseController {

    private String PREFIX = "/order/order/";
    
    @Resource
    IOrderService orderService;
    
    //@Resource
    //ordersMapper ordersMapper;
    
    @Resource
    OrderDao orderDao;
    
    @Resource
    private GunsProperties gunsProperties;
    /**
     * 跳转到订单首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "order.html";
    }

    /**
     * 跳转到添加订单
     */
    @RequestMapping("/order_add")
    public String orderAdd() {
        return PREFIX + "order_add.html";
    }

    /**
     * 跳转到修改订单
     */
    @RequestMapping("/order_update/{orderId}")
    public String orderUpdate(@PathVariable Integer orderId, Model model) {
    	Orders o = orderDao.selectById(orderId);
    	model.addAttribute("order", o);
    	LogObjectHolder.me().set(o);
        return PREFIX + "order_edit.html";
    }

    /**
     * 获取订单列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ApiOperation(value="订单管理", notes="订单列表")
    @ResponseBody
    public Object list(String condition) {
    	Page<Orders> page = new PageFactory<Orders>().defaultPage();
    	List<Orders> list = orderDao.getOrders(page);
    	 page.setRecords(list);
         return super.packForBT(page);
    }

    /**
     * 新增订单
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @BussinessLog(value = "新增订单", key = "name", dict = Dict.OrdersDict)
    @ApiOperation(value="订单管理", notes="新增订单")
    @Permission
    @ResponseBody
    public Object add(@ApiParam(value = "订单信息",required = true)Orders order) {
    	orderDao.insert(order);
        return super.SUCCESS_TIP;
    }

    /**
     * 删除订单
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete() {
        return SUCCESS_TIP;
    }


    /**
     * 修改订单
     */
    @RequestMapping(value = "/update")
    @BussinessLog(value = "修改订单", key = "name", dict = Dict.OrdersDict)
    @ResponseBody
    public Object update(@ApiParam(value = "订单信息",required = true)Orders order) {
    	orderDao.updateById(order);
        return super.SUCCESS_TIP;
    }

    /**
     * 订单详情
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Object detail() {
        return null;
    }
    
    /**
     * 上传图片(上传到项目的webapp/static/img)
     */
    @RequestMapping(method = RequestMethod.POST, path = "/upload")
    @ResponseBody
    public String upload(@RequestPart("file") MultipartFile picture) {
        String pictureName = UUID.randomUUID().toString() + ".jpg";
        try {
            String fileSavePath = gunsProperties.getFileUploadPath();
            picture.transferTo(new File(fileSavePath + pictureName));
        } catch (Exception e) {
            throw new BussinessException(BizExceptionEnum.UPLOAD_ERROR);
        }
        return pictureName;
    }
}

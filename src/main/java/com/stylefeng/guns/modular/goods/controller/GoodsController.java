package com.stylefeng.guns.modular.goods.controller;

import com.stylefeng.guns.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 商品控制器
 *
 * @author fengshuonan
 * @Date 2017-07-18 12:48:48
 */
@Controller
@RequestMapping("/goods")
public class GoodsController extends BaseController {

    private String PREFIX = "/goods/goods/";

    /**
     * 跳转到商品首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "goods.html";
    }

    /**
     * 跳转到添加商品
     */
    @RequestMapping("/goods_add")
    public String goodsAdd() {
        return PREFIX + "goods_add.html";
    }

    /**
     * 跳转到修改商品
     */
    @RequestMapping("/goods_update/{goodsId}")
    public String goodsUpdate(@PathVariable Integer goodsId, Model model) {
        return PREFIX + "goods_edit.html";
    }

    /**
     * 获取商品列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return null;
    }

    /**
     * 新增商品
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add() {
        return super.SUCCESS_TIP;
    }

    /**
     * 删除商品
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete() {
        return SUCCESS_TIP;
    }


    /**
     * 修改商品
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update() {
        return super.SUCCESS_TIP;
    }

    /**
     * 商品详情
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Object detail() {
        return null;
    }
}

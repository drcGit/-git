package com.stylefeng.guns.modular.order.dao;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.common.persistence.model.Orders;

/**
 * 订单Dao
 *
 * @author fengshuonan
 * @Date 2017-07-18 12:47:46
 */
public interface OrderDao extends BaseMapper<Orders> {

	List<Orders> getOrders(Page page);
}

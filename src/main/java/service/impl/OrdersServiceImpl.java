package service.impl;

import com.stylefeng.guns.common.persistence.model.Orders;
import com.stylefeng.guns.common.persistence.dao.OrdersMapper;
import service.IOrdersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {
	
}

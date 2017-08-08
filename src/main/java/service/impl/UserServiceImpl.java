package service.impl;

import com.stylefeng.guns.common.persistence.model.User;
import com.stylefeng.guns.common.persistence.dao.UserMapper;
import service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}

package service.impl;

import com.stylefeng.guns.common.persistence.model.LoginLog;
import com.stylefeng.guns.common.persistence.dao.LoginLogMapper;
import service.ILoginLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录记录 服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {
	
}

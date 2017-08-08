package service.impl;

import com.stylefeng.guns.common.persistence.model.Role;
import com.stylefeng.guns.common.persistence.dao.RoleMapper;
import service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
	
}

package service.impl;

import com.stylefeng.guns.common.persistence.model.Dept;
import com.stylefeng.guns.common.persistence.dao.DeptMapper;
import service.IDeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
	
}

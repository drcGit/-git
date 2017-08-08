package service.impl;

import com.stylefeng.guns.common.persistence.model.Test;
import com.stylefeng.guns.common.persistence.dao.TestMapper;
import service.ITestService;
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
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {
	
}

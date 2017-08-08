package service.impl;

import com.stylefeng.guns.common.persistence.model.OperationLog;
import com.stylefeng.guns.common.persistence.dao.OperationLogMapper;
import service.IOperationLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {
	
}

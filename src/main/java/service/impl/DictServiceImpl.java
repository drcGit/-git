package service.impl;

import com.stylefeng.guns.common.persistence.model.Dict;
import com.stylefeng.guns.common.persistence.dao.DictMapper;
import service.IDictService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {
	
}

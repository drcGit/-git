package service.impl;

import com.stylefeng.guns.common.persistence.model.Relation;
import com.stylefeng.guns.common.persistence.dao.RelationMapper;
import service.IRelationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements IRelationService {
	
}

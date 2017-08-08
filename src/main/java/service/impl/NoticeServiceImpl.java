package service.impl;

import com.stylefeng.guns.common.persistence.model.Notice;
import com.stylefeng.guns.common.persistence.dao.NoticeMapper;
import service.INoticeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通知表 服务实现类
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {
	
}

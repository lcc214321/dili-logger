package com.dili.logger.mapper;

import com.dili.logger.domain.BusinessLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * <B>Description</B>
 * <B>Copyright:本软件源代码版权归农丰时代所有,未经许可不得任意复制与传播.</B>
 * <B>农丰时代科技有限公司</B>
 *
 * @author yuehongbo
 * @date 2020/2/10 18:01
 */
public interface BusinessLogRepository extends ElasticsearchRepository<BusinessLog,Long> {
}

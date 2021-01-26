package org.mili.order.dao;

import org.mili.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 15:16:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wuwenjian
 * @email wuwenjian@qq.com
 * @date 2020-02-23 16:13:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

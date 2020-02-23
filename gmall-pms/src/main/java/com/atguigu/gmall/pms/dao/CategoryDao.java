package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wuwenjian
 * @email wuwenjian@qq.com
 * @date 2020-02-23 15:57:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

package org.mili.ware.dao;

import org.mili.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 15:13:45
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}

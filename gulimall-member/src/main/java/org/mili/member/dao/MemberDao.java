package org.mili.member.dao;

import org.mili.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 15:18:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

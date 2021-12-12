package com.stonebridge.mallmember.dao;

import com.stonebridge.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author stonebridge
 * @email stonebridge@njfu.edu.com
 * @date 2021-12-12 11:02:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

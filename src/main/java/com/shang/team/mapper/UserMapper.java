package com.shang.team.mapper;

import com.shang.team.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author sjy
 * @since 2019-02-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
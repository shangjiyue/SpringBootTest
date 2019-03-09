package com.shang.team.service;

import com.shang.team.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sjy
 * @since 2019-02-28
 */
public interface IUserService extends IService<User> {
    User selectUserByUsername(String username);
}

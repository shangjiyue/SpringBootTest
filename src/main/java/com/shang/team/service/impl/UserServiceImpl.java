package com.shang.team.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shang.team.entity.User;
import com.shang.team.mapper.UserMapper;
import com.shang.team.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sjy
 * @since 2019-02-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserByUsername(String username) {
        EntityWrapper<User> wrapper = new EntityWrapper<>();
        wrapper.eq(User.NAME, username);
        User user = new User();
        user.setName(username);
        User user1 = userMapper.selectOne(user);

        List<User> users = userMapper.selectList(wrapper);
        if(users.size() > 0){
            return users.get(0);
        }
        return null;
    }
}

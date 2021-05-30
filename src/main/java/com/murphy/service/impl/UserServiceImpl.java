package com.murphy.service.impl;

import com.murphy.bean.User;
import com.murphy.mapper.UserMapper;
import com.murphy.service.UserService;

import java.util.List;

/**
 * User - Service实现
 * Service调取Dao：组合Dao
 * @author murphy
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    /**
     * 查询用户
     * @param id
     * @return
     */
    public User findById(int id) {
        return userMapper.findById(id);
    }

    /**
     * 查询全部的用户
     * @return
     */
    public List<User> findAll() {
        return userMapper.findAll();
    }
}

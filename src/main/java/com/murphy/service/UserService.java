package com.murphy.service;

import com.murphy.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User Service接口
 * @author murphy
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    public int deleteById(int id);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * 查询用户
     * @param id
     * @return
     */
    public User findById(int id);

    /**
     * 查询全部的用户
     * @return
     */
    public List<User> findAll();
}

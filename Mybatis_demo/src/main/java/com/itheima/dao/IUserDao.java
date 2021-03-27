package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 *   用户持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
    /**
     * 保存
     */
    void saveUser (User user);

    /**
     * 更新用户
     */
    void updateUser (User user);
    /**
     * 根据ID删除用户
     */
    void deleteUser (Integer userId);
    /**
     * 根据Id查询一个
     */
    User findById (Integer userId);
    /**
     * 根据名称模糊查询用户信息
     */
    List<User> findByName(String username);
    /**
     * 查询总用户数
     */
    int findTotal();
}

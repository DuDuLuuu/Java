package com.JDb.dynamicProxy;

/**
 * @Author:JDb
 * @Date:2019/5/9
 */
public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("模拟保存用户");
    }

    @Override
    public void find() {
        System.out.println("模拟查找用户");
    }
}

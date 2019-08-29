package com.JDb.dynamicProxy;

/**
 * @Author:JDb
 * @Date:2019/5/9
 */
public class test {
    //动态代理
    //通过反射机制实现
    public static void main(String[] args) {
        UserService userService = (UserService) new ProxyFactory(new UserServiceImpl()).getProxyInstance();
        userService.find();

    }
}


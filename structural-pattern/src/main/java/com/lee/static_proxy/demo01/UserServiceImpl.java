package com.lee.static_proxy.demo01;

/**
 * 用户服务接口的实现类（被代理类）
 */
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("add");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void update() {
        System.out.println("update");
    }

    public void query() {
        System.out.println("query");
    }
}

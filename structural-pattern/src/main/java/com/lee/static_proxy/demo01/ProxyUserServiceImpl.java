package com.lee.static_proxy.demo01;

/**
 * 用户服务接口实现类的代理
 * 在真实对象的基础上加上日志操作
 */
public class ProxyUserServiceImpl implements UserService{
    //真实的被代理类，实际操作还是真实的被代理类来做，代理类可以做些附加操作
    private UserServiceImpl userServiceImpl;

    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    public void add() {

        userServiceImpl.add();
        log();
    }

    public void delete() {
        userServiceImpl.delete();
        log();
    }

    public void update() {
        userServiceImpl.update();
        log();
    }

    public void query() {
        userServiceImpl.query();
        log();
    }

    public void log(){
        System.out.println("记录下日志");
    }
}

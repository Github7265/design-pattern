package com.lee.static_proxy.demo01;

/**
 * 代理模式
 * 代理类和被代理类需要实现同一接口，代理类中的实际操作对象是被代理类，代理类中可以做附加操作
 */
public class TestDemo {
    public static void main(String[] args) {
        ProxyUserServiceImpl proxyUserService = new ProxyUserServiceImpl();
        proxyUserService.setUserServiceImpl(new UserServiceImpl());
        proxyUserService.add();
        proxyUserService.delete();
    }
}

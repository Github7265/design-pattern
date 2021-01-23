package com.lee.dynamic_proxy.demo01;

public class TestDemo {
    public static void main(String[] args) {
        ProxyInvocationHandler<Rent> rentProxyInvocationHandler = new ProxyInvocationHandler<Rent>(new Host());
        Rent proxy = rentProxyInvocationHandler.getProxy();//proxy就是动态生成的
        proxy.rent();

        ProxyInvocationHandler<Eat> eatProxyInvocationHandler = new ProxyInvocationHandler<Eat>(new Man());
        Eat eatProxy = eatProxyInvocationHandler.getProxy();
        eatProxy.eat();
    }
}

package com.lee.dynamic_proxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler<T> implements InvocationHandler {

    private T t;

    public ProxyInvocationHandler(T t) {
        this.t = t;
    }

    //生成得到代理类
    public T getProxy(){
        return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(),t.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(t, args);
        return invoke;
    }
}

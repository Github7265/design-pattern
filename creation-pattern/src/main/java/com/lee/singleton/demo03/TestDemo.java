package com.lee.singleton.demo03;

public class TestDemo {
    public static void main(String[] args) {
        LanHanSingletonThreaNoSafe instance = LanHanSingletonThreaNoSafe.getInstance();
        LanHanSingletonThreaNoSafe instance2 = LanHanSingletonThreaNoSafe.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

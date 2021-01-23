package com.lee.singleton.demo05;

public class TestDemo {
    public static void main(String[] args) {
        LanHanSingletonThreaSafeLockCode instance = LanHanSingletonThreaSafeLockCode.getInstance();
        LanHanSingletonThreaSafeLockCode instance2 = LanHanSingletonThreaSafeLockCode.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

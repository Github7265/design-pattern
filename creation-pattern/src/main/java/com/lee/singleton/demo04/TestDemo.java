package com.lee.singleton.demo04;

public class TestDemo {
    public static void main(String[] args) {
        LanHanSingletonThreaSafeLock instance = LanHanSingletonThreaSafeLock.getInstance();
        LanHanSingletonThreaSafeLock instance2 = LanHanSingletonThreaSafeLock.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

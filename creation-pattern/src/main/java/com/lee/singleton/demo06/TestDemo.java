package com.lee.singleton.demo06;

public class TestDemo {
    public static void main(String[] args) {
        LanHanSingletonDoubleCheck instance = LanHanSingletonDoubleCheck.getInstance();
        LanHanSingletonDoubleCheck instance2 = LanHanSingletonDoubleCheck.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

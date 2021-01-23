package com.lee.singleton.demo07;

public class TestDemo {
    public static void main(String[] args) {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

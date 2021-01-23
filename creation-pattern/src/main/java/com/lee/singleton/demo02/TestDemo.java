package com.lee.singleton.demo02;

public class TestDemo {
    public static void main(String[] args) {
        EHanSingletonStatic instanace = EHanSingletonStatic.getInstanace();
        EHanSingletonStatic instanace2 = EHanSingletonStatic.getInstanace();
        System.out.println(instanace.hashCode());
        System.out.println(instanace2.hashCode());

        /**
         * 测试结果，hashcode相等，证明是同一个实例对象
         */

    }
}

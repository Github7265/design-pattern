package com.lee.singleton.demo01;

public class TestDemo {
    public static void main(String[] args) {
        EHanSingleton instanace = EHanSingleton.getInstanace();
        EHanSingleton instanace2 = EHanSingleton.getInstanace();
        System.out.println(instanace.hashCode());
        System.out.println(instanace2.hashCode());

        /**
         * 测试结果，hashcode相等，证明是同一个实例对象
         */

    }
}

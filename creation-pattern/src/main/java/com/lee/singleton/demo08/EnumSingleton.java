package com.lee.singleton.demo08;

import sun.misc.Contended;

/**
 * 使用枚举实现单例模式
 * 优点：避免多线程同步问题，且能防止反序列化重新创建新的对象
 */
public class EnumSingleton{
    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton ==singleton2);
    }
}

 enum  Singleton {
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}

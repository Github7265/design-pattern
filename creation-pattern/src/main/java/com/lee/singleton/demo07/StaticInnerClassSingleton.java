package com.lee.singleton.demo07;

import com.lee.singleton.demo03.LanHanSingletonThreaNoSafe;

/**
 * 懒汉式（线程安全）
 *
 * 外部类加载时不会加载内部类，保证了懒加载，调用getInstance时加载内部类，
 * 静态变量保证了单例
 *
 * 推荐使用
 */
public class StaticInnerClassSingleton {


    //将构造方法私有化，防止外部new
    private StaticInnerClassSingleton(){}

    //静态内部类
    private static class StaticInnerClassSingletonInstance{
        //创建静态实例变量
        private static final StaticInnerClassSingleton lanHanSingletonThreaSafeLockCode = new StaticInnerClassSingleton();

    }

    //通过静态内部类的静态变量去获取实例变量
    public static StaticInnerClassSingleton getInstance(){
        return StaticInnerClassSingletonInstance.lanHanSingletonThreaSafeLockCode;
    }


}

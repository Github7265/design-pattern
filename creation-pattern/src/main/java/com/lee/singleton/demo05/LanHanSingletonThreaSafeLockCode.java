package com.lee.singleton.demo05;

import com.lee.singleton.demo03.LanHanSingletonThreaNoSafe;

/**
 * 懒汉式（线程安全,同步代码块）
 * 本意上是为了解决同步方法带来的效率问题，但实际上并没有解决效率问题
 * 优点：解决了线程不安全的问题
 * 缺点：效率太低，实际开发不推荐使用
 */
public class LanHanSingletonThreaSafeLockCode {
    //创建静态实例变量
    private static LanHanSingletonThreaSafeLockCode lanHanSingletonThreaSafeLockCode;

    //将构造方法私有化，防止外部new
    private LanHanSingletonThreaSafeLockCode(){}

    //当调用getInstance时才会去创建实例变量
    //加锁实现线程安全
    public static  LanHanSingletonThreaSafeLockCode getInstance(){
        if(lanHanSingletonThreaSafeLockCode == null){
            synchronized(LanHanSingletonThreaNoSafe.class){
                lanHanSingletonThreaSafeLockCode = new LanHanSingletonThreaSafeLockCode();
            }
        }
        return lanHanSingletonThreaSafeLockCode;
    }


}

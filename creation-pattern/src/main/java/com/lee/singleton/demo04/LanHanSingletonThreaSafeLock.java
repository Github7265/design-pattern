package com.lee.singleton.demo04;

/**
 * 懒汉式（线程安全，同步方法）
 * 优点：解决了线程不安全的问题
 * 缺点：效率太低，实际开发不推荐使用
 */
public class LanHanSingletonThreaSafeLock {
    //创建静态实例变量
    private static LanHanSingletonThreaSafeLock lanHanSingletonThreaSafeLock;

    //将构造方法私有化，防止外部new
    private LanHanSingletonThreaSafeLock(){}

    //当调用getInstance时才会去创建实例变量
    //加锁实现线程安全
    public static synchronized LanHanSingletonThreaSafeLock getInstance(){
        if(lanHanSingletonThreaSafeLock == null){
            lanHanSingletonThreaSafeLock = new LanHanSingletonThreaSafeLock();
        }
        return lanHanSingletonThreaSafeLock;
    }


}

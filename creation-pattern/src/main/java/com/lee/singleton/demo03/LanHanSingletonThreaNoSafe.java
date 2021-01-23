package com.lee.singleton.demo03;

/**
 * 懒汉式（线程不安全）
 */
public class LanHanSingletonThreaNoSafe {
    //创建静态实例变量
    private static LanHanSingletonThreaNoSafe lanHanSingletonThreaNoSafe;

    //将构造方法私有化，防止外部new
    private LanHanSingletonThreaNoSafe(){}

    //当调用getInstance时才会去创建实例变量
    public static LanHanSingletonThreaNoSafe getInstance(){
        if(lanHanSingletonThreaNoSafe == null){
            lanHanSingletonThreaNoSafe = new LanHanSingletonThreaNoSafe();
        }
        return lanHanSingletonThreaNoSafe;
    }


}

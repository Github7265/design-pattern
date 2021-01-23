package com.lee.singleton.demo02;

/**
 * 1、优点：写法简单，在类加载的时候完成实例化，避免了线程同步问题
 * 2、缺点：无法实现懒加载，若从来没用过这个实例，将会造成内存浪费
 */
public class EHanSingletonStatic {
//    1、将构造器私有化，防止外部new
    private EHanSingletonStatic(){

    }
//    2、本类内部创建对象实例
    private static EHanSingletonStatic instanace;
    static{
        //在静态代码块中，创建单例对象
        instanace = new EHanSingletonStatic();
    }

//    3、对外提供获取实例的方法
    public static EHanSingletonStatic getInstanace(){
        return instanace;
    }

}

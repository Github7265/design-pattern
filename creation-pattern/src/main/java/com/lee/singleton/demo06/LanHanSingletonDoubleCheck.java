package com.lee.singleton.demo06;

import com.lee.singleton.demo03.LanHanSingletonThreaNoSafe;

/**
 * 懒汉式（双重检查）
 *
 * 1、进行两次判空，这样就可以保证线程安全
 * 2、实例化代码只执行了一次，后面在访问时，判空会直接return实例化对象，避免反复进行方法同步
 * 3、线程安全；延迟加载；效率较高
 * 4、推荐使用
 *
 *
 *
 */
public class LanHanSingletonDoubleCheck {
    //volatile的作用是保证可见性，禁止指令重排

    //可使用@Contended注解来替换volatile，但是未验证

    //创建静态实例变量
    private static volatile LanHanSingletonDoubleCheck lanHanSingletonDoubleCheck;

    //将构造方法私有化，防止外部new
    private LanHanSingletonDoubleCheck(){}

    //当调用getInstance时才会去创建实例变量
    //加锁实现线程安全
    public static LanHanSingletonDoubleCheck getInstance(){
        //因为volatile修饰了该变量，当使用到这个变量时，必须从内存中获取该变量的值
        if(lanHanSingletonDoubleCheck == null){
            synchronized(LanHanSingletonThreaNoSafe.class){
                if (lanHanSingletonDoubleCheck == null) {
                    //volatile修饰，该变量的结果会被刷新到内存中
                    lanHanSingletonDoubleCheck = new LanHanSingletonDoubleCheck();
                }
            }
        }
        return lanHanSingletonDoubleCheck;
    }


}

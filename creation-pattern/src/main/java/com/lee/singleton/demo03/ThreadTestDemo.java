package com.lee.singleton.demo03;

/**
 * 查看结果，hashcode不完全一致，表示线程不安全
 * 实际开发中不能使用
 */
public class ThreadTestDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            new Thread(new TestThread()).start();
        }
    }
}

class TestThread implements Runnable{

    public void run() {
        LanHanSingletonThreaNoSafe instance = LanHanSingletonThreaNoSafe.getInstance();
        System.out.println(instance.hashCode());
    }
}

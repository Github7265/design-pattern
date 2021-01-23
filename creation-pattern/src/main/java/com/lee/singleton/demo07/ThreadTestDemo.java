package com.lee.singleton.demo07;

import java.util.concurrent.CountDownLatch;

/**
 * 查看结果，hashcode完全一致，表示线程安全且单例
 */
public class ThreadTestDemo {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        CountDownLatch cdl = new CountDownLatch(100);
        for (int i = 0; i < 100 ; i++) {
            new Thread(new TestThread(cdl)).start();
        }
        cdl.await();
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
    }
}

class TestThread implements Runnable{

    private CountDownLatch cdl;

    public TestThread(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    public void run() {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(instance.hashCode());
        cdl.countDown();
    }
}

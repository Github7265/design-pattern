package com.lee.facade.demo01;

public class Thing02 {

    private static Thing02 instance  = new Thing02();

    private Thing02(){}

    public static Thing02 getInstance() {
        return instance;
    }

    public void start(){
        System.out.println("Thing02.....start");
    }

    public void end(){
        System.out.println("Thing02.....end");
    }
}

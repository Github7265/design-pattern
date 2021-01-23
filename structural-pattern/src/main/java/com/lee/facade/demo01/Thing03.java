package com.lee.facade.demo01;

public class Thing03 {

    private static Thing03 instance  = new Thing03();

    private Thing03(){}

    public static Thing03 getInstance() {
        return instance;
    }

    public void start(){
        System.out.println("Thing03.....start");
    }

    public void end(){
        System.out.println("Thing03.....end");
    }
}

package com.lee.facade.demo01;

public class Thing01 {

    private static Thing01 instance = new Thing01();

    private Thing01(){}

    public static Thing01 getInstance() {
        return instance;
    }

    public void start(){
        System.out.println("Thing01.....start");
    }

    public void end(){
        System.out.println("Thing01.....end");
    }
}

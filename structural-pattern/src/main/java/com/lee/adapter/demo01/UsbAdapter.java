package com.lee.adapter.demo01;

/**
 * USB适配器
 */
public class UsbAdapter implements Adapter{

    //使用组合关系
    private Adaptee adaptee = new Adaptee();

    public void linkNet() {
        System.out.println("使用UsbAdapter实现上网");
        adaptee.request();
    }
}

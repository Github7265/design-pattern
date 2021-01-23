package com.lee.abstract_factory.demo01;

public class XiaoMiPhone implements IphoneProduct{
    public void call() {
        System.out.println("我用小米手机打电话");
    }

    public void takingPictures() {
        System.out.println("我用小米手机照相");
    }
}

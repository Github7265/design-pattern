package com.lee.abstract_factory.demo01;

public class HuaWeiPhone implements IphoneProduct{
    public void call() {
        System.out.println("我用华为手机打电话");
    }

    public void takingPictures() {
        System.out.println("我用华为手机照相");
    }
}

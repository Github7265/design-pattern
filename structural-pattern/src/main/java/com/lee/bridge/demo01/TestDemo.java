package com.lee.bridge.demo01;

/**
 * 桥接模式：
 * 1、两个不同的维度产生关系，比如示例中的电脑品牌和电脑类型
 * 2、各个维度的扩展互不影响，比如电脑品牌可以增加戴尔，电脑类型可以增加云电脑
 */

public class TestDemo {
    public static void main(String[] args) {
        Computer desktop = new Desktop(new Lenovo());
        desktop.info();

        Laptop laptop = new Laptop(new Apple());
        laptop.info();
    }
}

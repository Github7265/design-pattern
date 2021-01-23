package com.lee.factory_method.demo01;

public class TestDemo {
    public static void main(String[] args) {
        WuLingFactory wuLingFactory = new WuLingFactory();
        System.out.println(wuLingFactory.createCar().getCarBrand());

        JiLiFactory jiLiFactory = new JiLiFactory();
        System.out.println(jiLiFactory.createCar().getCarBrand());
    }
}

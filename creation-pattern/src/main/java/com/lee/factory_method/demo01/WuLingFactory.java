package com.lee.factory_method.demo01;

public class WuLingFactory implements CarFactory{
    public Car createCar() {
        return new WuLingCar();
    }
}

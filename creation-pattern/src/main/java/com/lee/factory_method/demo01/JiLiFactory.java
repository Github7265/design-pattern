package com.lee.factory_method.demo01;

public class JiLiFactory implements CarFactory{
    public Car createCar() {
        return new JiLiCar();
    }
}

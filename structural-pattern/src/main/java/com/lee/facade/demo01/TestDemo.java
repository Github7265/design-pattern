package com.lee.facade.demo01;

/**
 * 外观模式
 */
public class TestDemo {
    public static void main(String[] args) {
        ThingFacade thingFacade = new ThingFacade();

        thingFacade.start();
        System.out.println("----------------------");
        thingFacade.end();
    }
}

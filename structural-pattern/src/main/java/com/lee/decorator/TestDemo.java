package com.lee.decorator;

/**
 * 装饰器模式的核心是
 *
 */
public class TestDemo {
    public static void main(String[] args) {
        //本质上还是饮料，但这个饮料拥有了辅料的加强
        Drink drink = new Sugar(new Colo());
        System.out.println(drink.getName()+"价格是："+drink.getPrice());

        drink =new Coconut(new Sugar(new Colo()));
        System.out.println(drink.getName()+"价格是："+drink.getPrice());
    }
}

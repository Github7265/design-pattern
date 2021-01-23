package com.lee.decorator;

/**
 * 装饰器模式的核心是：
 * 装饰器要实现或继承与被装饰类一样的接口或父类
 * 装饰器中需要组合一个被装饰类
 */
public class DrinkDecorator implements Drink{

    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    public String getName() {
        return drink.getName();
    }

    public Integer getPrice() {
        return drink.getPrice();
    }
}

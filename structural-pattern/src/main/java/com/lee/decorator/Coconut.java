package com.lee.decorator;

/**
 * 椰果类
 */
public class Coconut extends DrinkDecorator{
    public Coconut(Drink drink) {
        super(drink);
    }

    @Override
    public String getName() {
        return super.getName()+"+椰果";
    }

    @Override
    public Integer getPrice() {
        //椰果3元
        return super.getPrice()+3;
    }
}

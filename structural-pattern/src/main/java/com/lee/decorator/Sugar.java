package com.lee.decorator;

public class Sugar extends DrinkDecorator{
    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public String getName() {
        return super.getName()+"+糖";
    }

    @Override
    public Integer getPrice() {
        //糖2元
        return super.getPrice()+2;
    }
}

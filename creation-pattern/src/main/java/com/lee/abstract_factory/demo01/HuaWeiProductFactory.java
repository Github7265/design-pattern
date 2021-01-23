package com.lee.abstract_factory.demo01;

public class HuaWeiProductFactory implements IProductFactory{
    public IphoneProduct productPhone() {
        return new HuaWeiPhone();
    }

    public IpadProduct productPad() {
        return new HuaWeiPad();
    }
}

package com.lee.abstract_factory.demo01;

public class XiaoMiProductFactory implements IProductFactory{
    public IphoneProduct productPhone() {
        return new XiaoMiPhone();
    }

    public IpadProduct productPad() {
        return new XiaoMiPad();
    }
}

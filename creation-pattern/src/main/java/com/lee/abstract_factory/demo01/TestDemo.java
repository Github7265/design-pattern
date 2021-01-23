package com.lee.abstract_factory.demo01;

public class TestDemo {

    public static void main(String[] args) {
        XiaoMiProductFactory xiaoMiProductFactory = new XiaoMiProductFactory();
        IphoneProduct xiaomiIphoneProduct = xiaoMiProductFactory.productPhone();
        xiaomiIphoneProduct.call();
        xiaomiIphoneProduct.takingPictures();
        IpadProduct xiaomiIpadProduct = xiaoMiProductFactory.productPad();
        xiaomiIpadProduct.playGame();
        xiaomiIpadProduct.seeMovie();


        HuaWeiProductFactory huaWeiProductFactory = new HuaWeiProductFactory();
        IphoneProduct huaWeiIphoneProduct = huaWeiProductFactory.productPhone();
        huaWeiIphoneProduct.call();
        huaWeiIphoneProduct.takingPictures();
        IpadProduct huaweiIpadProduct = huaWeiProductFactory.productPad();
        huaweiIpadProduct.playGame();
        huaweiIpadProduct.seeMovie();

    }

}

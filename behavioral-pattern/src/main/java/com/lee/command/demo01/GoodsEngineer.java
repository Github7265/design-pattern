package com.lee.command.demo01;

/**
 * 负责商品服务的工程师
 */
public class GoodsEngineer extends Engineer{

    @Override
    public void doSomething() {
        super.operation.startGoodsDb();
        super.operation.startCommonDb();;
        super.operation.startCommonService();
        super.operation.startGoodsService();
        super.operation.startGoodsWebService();
        super.operation.startMiddlewareService();
    }
}

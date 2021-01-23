package com.lee.command.demo01;

/**
 * 负责订单服务的工程师
 */
public class OrderEngineer extends Engineer{

    @Override
    public void doSomething() {
        super.operation.startOrderDb();
        super.operation.startCommonDb();;
        super.operation.startCommonService();
        super.operation.startOrderService();
        super.operation.startOrderWebService();
        super.operation.startMiddlewareService();
    }
}

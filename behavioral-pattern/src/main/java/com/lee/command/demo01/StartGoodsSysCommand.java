package com.lee.command.demo01;

public class StartGoodsSysCommand extends Command{
/*（1）启动商品数据库
（2）启动公共数据库
（3）启动公共服务
（4）启动商品服务
（5）启动商品前台服务
（5）启动相关中间件服务*/
    @Override
    public void execute() {
        super.operation.startGoodsDb();
        super.operation.startCommonDb();;
        super.operation.startCommonService();
        super.operation.startGoodsService();
        super.operation.startGoodsWebService();
        super.operation.startMiddlewareService();
    }
}

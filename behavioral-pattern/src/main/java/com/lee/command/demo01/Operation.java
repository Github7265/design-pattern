package com.lee.command.demo01;

/**
 * 一个大型的微服务项目，是需要各个系统之间的相互联系才能正常使用的，
 * 比如订单系统正常运行需要做的事情有：
 * （1）启动订单单数据库
 * （2）启动公共数据库
 * （3）启动公共服务
 * （4）启动订单服务
 * （5）启动订单前台服务
 * （5）启动中间件服务
 * 商品系统正常运行需要做的事情有：
 *  * （1）启动商品数据库
 *  * （2）启动公共数据库
 *  * （3）启动公共服务
 *  * （4）启动商品服务
 *  * （5）启动商品前台服务
 *  * （5）启动相关中间件服务
 * 操作类
 */
public class Operation {
    /**
     * 启动订单数据库
     */
    public void startOrderDb(){
        System.out.println("启动订单数据库");
    }
    /**
     * 启动订单服务
     */
    public void startOrderService(){
        System.out.println("启动订单服务");
    }
    /**
     * 启动订单前台服务
     */
    public void startOrderWebService(){
        System.out.println("启动订单前台服务");
    }
    /**
     * 启动商品数据库
     */
    public void startGoodsDb(){
        System.out.println("启动商品数据库");
    }
    /**
     * 启动商品服务
     */
    public void startGoodsService(){
        System.out.println("启动商品服务");
    }
    /**
     * 启动商品前台服务
     */
    public void startGoodsWebService(){
        System.out.println("启动商品前台服务");
    }
    /**
     * 启动公共数据库
     */
    public void startCommonDb(){
        System.out.println("启动公共数据库");
    }
    /**
     * 启动公共服务
     */
    public void startCommonService(){
        System.out.println("启动公共服务");
    }
    /**
     * 启动中间件服务
     */
    public void startMiddlewareService(){
        System.out.println("启动中间件服务");
    }
}

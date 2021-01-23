package com.lee.command.demo01;

public class TestDemo {
    public static void main(String[] args) {
        //定义项目经理，来调度命令
        ProjectManager projectManager = new ProjectManager();
        //定义命令接收者，也是命令的真正执行者
        OrderEngineer orderEngineer = new OrderEngineer();
        //定义启动订单服务命令，并指定给负责订单服务的工程师
        StartOrderSysCommand startOrderSysCommand = new StartOrderSysCommand(orderEngineer);
        //项目经理发布命令
        projectManager.setComman(startOrderSysCommand);
        //项目经理宣布执行命令，实际不是项目经理执行
        projectManager.action();



        //定义命令接收者，也是命令的真正执行者
        GoodsEngineer goodsEngineer = new GoodsEngineer();
        //定义启动商品服务命令，并指定给负责商品服务的工程师
        StartGoodsSysCommand startGoodsSysCommand = new StartGoodsSysCommand(goodsEngineer);
        //项目经理发布命令
        projectManager.setComman(startGoodsSysCommand);
        //项目经理宣布执行命令，实际不是项目经理执行
        projectManager.action();
    }
}

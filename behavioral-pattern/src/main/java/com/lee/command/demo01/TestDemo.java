package com.lee.command.demo01;

public class TestDemo {
    public static void main(String[] args) {
        //定义开发工程师，用来执行命令
        DevelopmentEngineer developmentEngineer = new DevelopmentEngineer();
        //定义启动订单服务命令
        StartOrderSysCommand startOrderSysCommand = new StartOrderSysCommand();
        //开发工程师接到命令
        developmentEngineer.setComman(startOrderSysCommand);
        //开发工程执行命令
        developmentEngineer.action();



        //定义启动商品服务命令
        StartGoodsSysCommand startGoodsSysCommand = new StartGoodsSysCommand();
        //开发工程师接到命令
        developmentEngineer.setComman(startGoodsSysCommand);
        //开发工程师执行命令
        developmentEngineer.action();
    }
}

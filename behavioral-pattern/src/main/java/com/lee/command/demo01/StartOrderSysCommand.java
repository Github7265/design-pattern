package com.lee.command.demo01;

public class StartOrderSysCommand extends Command {
/* （1）启动订单数据库
 （2）启动公共数据库
 （3）启动公共服务
 （4）启动订单服务
 （5）启动订单前台服务
 （6）启动中间件服务*/


    private Engineer engineer;

    public StartOrderSysCommand(Engineer engineer) {
        this.engineer = engineer;
    }

    @Override
    public void execute() {
        this.engineer.doSomething();
    }
}

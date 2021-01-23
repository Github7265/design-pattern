package com.lee.command.demo01;

/**
 * 开发工程师
 * 职责：调用命令启动对应服务
 */
public class ProjectManager {
    private Command comman;

    public void setComman(Command comman) {
        this.comman = comman;
    }

    public void action(){
        this.comman.execute();
    }
}

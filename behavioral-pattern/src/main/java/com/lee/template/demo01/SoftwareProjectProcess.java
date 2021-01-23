package com.lee.template.demo01;

/**
 * 定义一个软件工程的基本流程
 * （1）需求设计
 * （2）代码研发
 * （3）功能测试
 * （4）部署上线
 * 抽象类
 * 多个抽象方法
 * 一个或多个具体模板方法
 */
public abstract class SoftwareProjectProcess {
    /**
     * 需求设计
     */
    abstract void demandDesign();
    /**
     * 代码研发
     */
    abstract void codeDev();
    /**
     * 功能测试
     */
    abstract void functionTest();
    /**
     * 部署上线
     */
    abstract void deployOnline();

    /**
     * 基本的软件工程流程
     */
    final void softwareProjectStart(){
        demandDesign();
        codeDev();
        functionTest();
        deployOnline();
    }
}

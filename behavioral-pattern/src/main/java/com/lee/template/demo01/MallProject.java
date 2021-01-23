package com.lee.template.demo01;

/**
 * 商城项目
 */
public class MallProject extends SoftwareProjectProcess{
    @Override
    void demandDesign() {
        System.out.println("商城项目-需求设计...");
    }

    @Override
    void codeDev() {
        System.out.println("商城项目-代码研发...");
    }

    @Override
    void functionTest() {
        System.out.println("商城项目-功能测试...");
    }

    @Override
    void deployOnline() {
        System.out.println("商城项目-部署上线...");
    }
}

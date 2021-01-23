package com.lee.template.demo01;

public class TestDemo {
    public static void main(String[] args) {
        //接到一个商城项目，开搞
        SoftwareProjectProcess mallProject = new MallProject();
        mallProject.softwareProjectStart();
        
        //接到一个政府项目，开搞
        SoftwareProjectProcess governmentProject = new GovernmentProject();
        governmentProject.softwareProjectStart();
    }
}

package com.lee.combination.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 院系
 */
public class Department extends OrganizationComponent{


    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    void print() {
        System.out.println(getName());
    }
}

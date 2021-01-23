package com.lee.combination.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 */
public class College extends OrganizationComponent{

    //专业list
    private List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        list.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        super.remove(organizationComponent);
    }

    @Override
    void print() {
        System.out.println(getName());
        for (OrganizationComponent organizationComponent: list) {
            organizationComponent.print();
        }
    }
}

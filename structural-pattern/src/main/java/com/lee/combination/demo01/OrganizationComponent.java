package com.lee.combination.demo01;

/**
 * 组织类
 */
public abstract class OrganizationComponent {

    //组织属性
    private String name;
    private String desc;

    public OrganizationComponent() {
    }

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //添加下级组织
    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException("底层组织无下级组织，不支持添加操作");
    }
    //移除下级组织
    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException("底层组织无下级组织，不支持移除操作");
    }

    abstract void print();

}

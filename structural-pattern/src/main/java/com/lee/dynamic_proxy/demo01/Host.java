package com.lee.dynamic_proxy.demo01;

/**
 * 房东
 */
public class Host implements Rent {
    public void rent() {
        System.out.println("房东租房");
    }
}

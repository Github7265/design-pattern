package com.lee.adapter.demo01;

//客户端类

/**
 * Computer想要与Adaptee产生关系，但是没有直接关系，使用一个适配器来连接两者
 */
public class Computer {
    private Adapter adapter;

    public Computer(Adapter adapter) {
        this.adapter = adapter;
    }

    public void linkNet(){
        adapter.linkNet();
    }

}

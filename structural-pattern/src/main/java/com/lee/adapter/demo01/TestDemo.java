package com.lee.adapter.demo01;

public class TestDemo {
    public static void main(String[] args) {


//        Adaptee adaptee = new Adaptee();

        UsbAdapter usbAdapter = new UsbAdapter();
        Computer computer = new Computer(usbAdapter);
        computer.linkNet();
    }
}

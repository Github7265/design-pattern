package com.lee.builder;

public class TestDemo {
    public static void main(String[] args) {
//        Worker worker = new Worker();
//        //先加鸡柳，再加肉松
//        String selectItem = worker.addItem(new JiLiu()).addItem(new RouSong()).getSelectItem();
//        System.out.println(selectItem);
//
//        //先加培根，再加香肠
//        String selectItem2 = worker.addItem(new PeiGen()).addItem(new XiangChang()).getSelectItem();
//        System.out.println(selectItem2);


        ShouZhuaBingBuilder shouZhuaBingBuilder = new ShouZhuaBingBuilder();
        //套餐01
        String selectItem1 = shouZhuaBingBuilder.package01().getSelectItem();
        System.out.println(selectItem1);
        //套餐02
        String selectItem3 = shouZhuaBingBuilder.package02().getSelectItem();
        System.out.println(selectItem3);
    }
}

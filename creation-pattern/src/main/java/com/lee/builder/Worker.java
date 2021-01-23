package com.lee.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个指导类
 * 这里是指手抓饼的老板
 */
public class Worker {
    private List<Item> selectItem ;


    public Worker() {
        this.selectItem = new ArrayList<Item>();
    }

    public Worker addItem(Item item){
        selectItem.add(item);
        return this;
    }

    public String getSelectItem(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < selectItem.size(); i++) {
            sb.append(selectItem.get(i).getName());
            if(i<selectItem.size()-1){
                sb.append(",");
            }
        }
        sb.append("]");
        selectItem.clear();
        return sb.toString();
    }
}

package com.lee.builder;

import java.util.ArrayList;
import java.util.List;

public class ShouZhuaBingBuilder {

    private List<Item> selectItem ;


    public ShouZhuaBingBuilder() {
        this.selectItem = new ArrayList<Item>();
    }

    public ShouZhuaBingBuilder package01 (){
        selectItem.clear();
        selectItem.add(new JiLiu());
        selectItem.add(new RouSong());
        return this;
    }

    public ShouZhuaBingBuilder package02 (){
        selectItem.clear();
        selectItem.add(new PeiGen());
        selectItem.add(new XiangChang());
        return this;
    }


    public ShouZhuaBingBuilder addItem(Item item){
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
        return sb.toString();
    }
}

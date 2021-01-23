package com.lee.flyweight.demo01;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory implements ShapeFactory{
    private Map<String,Circle> shapeMap = new HashMap<String,Circle>();

    public  Circle getShape(String color) {
        Circle shape = shapeMap.get(color);
        if(shape == null){
            shape = new Circle(color);
            shapeMap.put(color, shape);
        }
        return shape;
    }
}

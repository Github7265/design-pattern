package com.lee.flyweight.demo01;

public class Circle implements Shape{

    private String color;
    private Integer x;
    private Integer y;
    private Integer radis;

    public Circle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getRadis() {
        return radis;
    }

    public void setRadis(Integer radis) {
        this.radis = radis;
    }

    public void draw() {
        System.out.println(this.hashCode()+"-----"+color+"的圆，坐标为("+x+","+y+"),半径为"+radis);

    }
}

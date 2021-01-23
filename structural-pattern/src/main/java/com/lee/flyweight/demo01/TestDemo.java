package com.lee.flyweight.demo01;

/**
 * 享元模式：为了使相似的对象可以复用，节省空间资源
 */
public class TestDemo {

    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        for (int i = 0; i < 20; ++i) {
            Circle circle = circleFactory.getShape(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadis(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
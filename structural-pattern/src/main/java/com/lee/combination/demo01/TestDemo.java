package com.lee.combination.demo01;

public class TestDemo {
    public static void main(String[] args) {
        University university = new University("清华大学", "我的母校");

        College computorCollege = new College("计算机学院", "学计算机的");
        College jingguanCollege = new College("经管学院", "学金融的");

        computorCollege.add(new Department("软件工程","学软件的"));
        computorCollege.add(new Department("计算机科学与技术","学技术的"));
        computorCollege.add(new Department("网络工程","学网络的"));

        jingguanCollege.add(new Department("会计学院","学会计的"));
        jingguanCollege.add(new Department("金融学院","学金融的"));

        university.add(computorCollege);
        university.add(jingguanCollege);

        university.print();
    }
}

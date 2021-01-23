package com.lee.prototype.demo_deep_copy;

import java.util.Date;

public class TestDemo {
//video===Video{createDate=Mon Nov 09 22:17:46 CST 2020}
//clone===Video{createDate=Mon Nov 09 22:17:46 CST 2020}
//============================
//video===Video{createDate=Mon Jan 05 10:32:15 CST 1970}
//clone===Video{createDate=Mon Nov 09 22:17:46 CST 2020}

    //通过运行结果发现，修改参数date后重新打印，旧对象的属性改变了，而克隆对象的属性没有改变，这个就是深拷贝

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video video = new Video(date);
        //克隆video对象
        Video clone = (Video) video.clone();

        System.out.println("video==="+video);
        System.out.println("clone==="+clone);

        System.out.println("============================");


        date.setTime(354735423);
        System.out.println("video==="+video);
        System.out.println("clone==="+clone);
    }
}

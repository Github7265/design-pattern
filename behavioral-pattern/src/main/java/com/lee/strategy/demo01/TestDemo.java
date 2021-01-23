package com.lee.strategy.demo01;

import com.lee.strategy.demo01.bubble.BubbleSort;
import com.lee.strategy.demo01.insert.InsertSort;
import com.lee.strategy.demo01.merge.MergeSort;
import com.lee.strategy.demo01.select.SelectSort;
import com.lee.strategy.demo01.shell.ShellSort;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 800000);
        }

        long s1 = System.currentTimeMillis();
        Context context = new Context(new BubbleSort());
        context.sort(arr);
        long e1 = System.currentTimeMillis();
        System.out.println("冒泡排序耗时："+(e1-s1));

        s1 = System.currentTimeMillis();
        context = new Context(new InsertSort());
        context.sort(arr);
        e1 = System.currentTimeMillis();
        System.out.println("插入排序耗时："+(e1-s1));
//
        s1 = System.currentTimeMillis();
        context = new Context(new MergeSort());
        context.sort(arr);
        e1 = System.currentTimeMillis();
        System.out.println("归并排序耗时："+(e1-s1));

        s1 = System.currentTimeMillis();
        context = new Context(new SelectSort());
        context.sort(arr);
        e1 = System.currentTimeMillis();
        System.out.println("选择排序耗时："+(e1-s1));

        s1 = System.currentTimeMillis();
        context = new Context(new ShellSort());
        context.sort(arr);
        e1 = System.currentTimeMillis();
        System.out.println("希尔排序耗时："+(e1-s1));
    }
}

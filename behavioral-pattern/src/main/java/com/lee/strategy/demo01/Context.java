package com.lee.strategy.demo01;

public class Context {
    /**
     * 抽象算法策略
     */
    private SortStrategy sortStrategy;

    public Context(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] arr){
        this.sortStrategy.sort(arr);
    }
}

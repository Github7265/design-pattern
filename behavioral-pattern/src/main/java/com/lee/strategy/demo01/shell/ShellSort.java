package com.lee.strategy.demo01.shell;

import com.lee.strategy.demo01.SortStrategy;

/**
 * 希尔排序
 */
public class ShellSort implements SortStrategy {

    public int[] sort(int[] arr){
        //先根据数组的length除以2，得到一个分组，这个分组的个数其实也是步长
        //一轮之后再进行除2，缩小步长
        int temp = 0;
        for (int gap = arr.length/2; gap > 0; gap /=2) {
            for (int i = 0; i < arr.length && i+gap<arr.length; i++) {
                if(arr[i]>arr[i+gap]){
                    temp = arr[i+gap];
                    arr[i+gap] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

}

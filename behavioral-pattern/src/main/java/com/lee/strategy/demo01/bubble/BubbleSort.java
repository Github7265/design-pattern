package com.lee.strategy.demo01.bubble;

import com.lee.strategy.demo01.SortStrategy;

/**
 * 冒泡排序
 */
public class BubbleSort implements SortStrategy {
    public int[] sort(int[] arr){
        int temp = 0;
        boolean flag = false;
        for (int i = 0;i<arr.length-1;i++){
            //因为每进行一趟排序，都会确定一个值到最后，所以确定好的值就不用再进行排序了
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){
                break;
            }else{
                flag = false;
            }
        }
        return arr;
    }
}

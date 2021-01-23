package com.lee.strategy.demo01.select;

import com.lee.strategy.demo01.SortStrategy;

/**
 * 选择排序
 * 选择一个值作为假定最小值，然后分别去比较，如果有更小的，就替换假定最小值
 */
public class SelectSort implements SortStrategy {
    public  int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            //假设第i个值为最小值
            int minValue = arr[i];
            int minIndex = i;
            //第一个值arr[0]已经取出，从第二个值开始比较
            for (int j = 1; j < arr.length; j++) {
                if(minIndex > arr[j]){//说明假定最小值，并不是最小
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            //每一轮会获取一个最小值，将最小值放到对应的位置
            if(minIndex!=0){
                arr[minIndex] = arr[i];
                //因为是按顺序取得值，所以在放置值时也是按照1、2、3...有序放置
                arr[i] = minValue;
            }
        }
        return arr;
    }


}

package com.lee.strategy.demo01.insert;

import com.lee.strategy.demo01.SortStrategy;

/**
 * 插入排序，类比打扑克中的起牌环节
 */
public class InsertSort implements SortStrategy {
    public  int[] sort(int[] arr) {
        //默认第一个元素是有序的，从第二个元素开始排序
        for (int i = 1; i < arr.length; i++) {
            //待排序的数
            int insertVal = arr[i];
            //想要插入的位置
            int insertIndex = i - 1;
            //需要判断防止一直往前移位导致数组越界
            //如果待插入的值<想要插入的那个位置的值，就把 想要插入的那个位置的值 往后移一位 ，将待插入的值放到该位置  鸠占鹊巢
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                //插入排序是从当前相邻的位置开始动手，如果当前相邻位置比较不成功，就往前再移一位，前面的都是已经排过序的
                insertIndex--;
            }
            //当跳出循环时，说明待排序的数已经找到了合适的位置
            //因为上面执行了--操作，此时需要将index的值加回来
            arr[insertIndex+1] = insertVal;
        }
        return arr;
    }
}

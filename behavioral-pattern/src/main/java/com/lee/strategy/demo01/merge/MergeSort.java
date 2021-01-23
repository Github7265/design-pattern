package com.lee.strategy.demo01.merge;

import com.lee.strategy.demo01.SortStrategy;

/**
 * 归并排序
 */
public class MergeSort implements SortStrategy {

    public int[] sort(int[] arr) {
        int temp[] = new int[arr.length];
        sort(arr,0,arr.length - 1, temp);
        return arr;
    }

    public void sort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            //向左递归分解
            sort(arr, left, mid, temp);
            //向右递归分解
            sort(arr, mid + 1, right, temp);
            //最后一定要合并
            merge(arr, left,right,mid , temp);
        }

    }


    public static void merge(int[] arr, int left, int right, int mid, int[] temp) {

        //初始化i：表示左边有序序列的初始索引
        int i = left;
        //初始化j：表示右边有序序列的初始索引
        int j = mid + 1;
        //初始化t：表示临时数组的当前索引
        int t = 0;
        //第一步：先将左右两边（有序）的数据按照规则（左取一个，右取一个，相互比较，小的存入临时数组中）
        //填充到临时数组temp中，直到左右两边的有序序列，有一边处理完毕为止
        while (i <= mid && j <= right) {
            //当左取元素小于右取元素时，将左取元素放置到临时数组中，然后左侧索引往右移动一位，临时数组的索引往右移动一位
            if (arr[i] < arr[j]) {
                temp[t] = arr[i];
                i += 1;
                t += 1;
            }
            //当右取元素小于左取元素时，将右取元素放置到临时数组中，然后右侧索引往右移动一位，临时数组的索引往右移动一位
            else {
                temp[t] = arr[j];
                j += 1;
                t += 1;
            }
        }

        //第二步：当左侧还有剩余元素时，需要将左侧元素依次移动到临时数组中
        //判断依据：如果左侧已经取完了，那么左侧的索引i应该已经超过了mid
        while (i <= mid) {
            temp[t] = arr[i];
            i += 1;
            t += 1;
        }

        //第三步：当右侧还有剩余元素时，需要将右侧元素依次移动到临时数组中
        //判断依据：如果右侧已经取完了，那么右侧的索引i应该已经超过了right
        while (j <= right) {
            temp[t] = arr[j];
            j += 1;
            t += 1;
        }
//        System.out.println(Arrays.toString(temp));
        //第四步：将临时数组中的数据移动到原数组中
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }
    }


}

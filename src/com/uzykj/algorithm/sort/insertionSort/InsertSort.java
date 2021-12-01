package com.uzykj.algorithm.sort.insertionSort;

/**
 * @author name
 * @date 2019-01-24 9:54
 * @classDescribe 插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 * @className 插入排序
 */
public class InsertSort {

    /**
     * @param array
     * @return int[]
     * @MethodName 直接插入排序
     * @MethodDescribe 工作原理：是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
     */
    public static int[] directInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > temp; j--) {
                //将大于temp的值整体后移一个单位
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }

    /**
     * @param array
     * @return int[]
     * @MethodName 希尔排序/递减增量排序算法
     * @MethodDescribe 希尔排序是非稳定排序算法。
     * 1、插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率
     * 2、但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位
     */
    public static int[] shellSort(int[] array) {
        int i;
        int j;
        int temp;
        int gap = 1;
        int len = array.length;
        while (gap < len / 3) gap = gap * 3 + 1;
        for (; gap > 0; gap /= 3) {
            for (i = gap; i < len; i++) {
                temp = array[i];
                for (j = i - gap; j >= 0 && array[j] > temp; j -= gap) {
                    array[j + gap] = array[j];
                }
                array[j + gap] = temp;
            }
        }
        return array;
    }
}

package com.uzykj.algorithm.sort.mergingSort;

/**
 * @author ghostxbh
 * @date 24/01/2019 11:08
 */
public class MergingSort {

    /**
     * @param array
     * @return
     * @MethodName 归并排序
     * @MethodDescribe 是创建在归并操作上的一种有效的排序算法，效率为O(n\log n)（大O符号）。
     * 1945年由约翰·冯·诺伊曼首次提出。
     * 该算法是采用分治法（Divide and Conquer）的一个非常典型的应用，且各层分治递归可以同时进行。
     */
    public static int[] mergingSort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    private static void sort(int[] data, int left, int right) {
        if (left < right) {
            //找出中间索引
            int center = (left + right) / 2;
            //对左边数组进行递归
            sort(data, left, center);
            //对右边数组进行递归
            sort(data, center + 1, right);
            //合并
            merge(data, left, center, right);
        }
    }

    private static void merge(int[] data, int left, int center, int right) {
        int[] tmpArr = new int[data.length];
        int mid = center + 1;
        //third记录中间数组的索引
        int third = left;
        int tmp = left;
        while (left <= center && mid <= right) {
            //从两个数组中取出最小的放入中间数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }

        //剩余部分依次放入中间数组
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }

        while (left <= center) {
            tmpArr[third++] = data[left++];
        }

        //将中间数组中的内容复制回原数组
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }

}

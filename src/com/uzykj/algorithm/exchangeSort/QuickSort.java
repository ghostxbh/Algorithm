package com.uzykj.algorithm.exchangeSort;

/**
 * @author ghostxbh
 * @date 24/01/2019 11:04
 */
public class QuickSort {

    /**
     * @param array
     * @return
     * @MethodName 快速排序/划分交换排序/快排
     * @MethodDescribe 在平均状况下，排序n个项目要O(n\log n)（大O符号）次比较。
     * 在最坏状况下则需要O(n^{2})次比较，但这种状况并不常见。
     * 事实上，快速排序(n\log n)通常明显比其他算法更快，因为它的内部循环（inner loop）可以在大部分的架构上很有效率地达成。
     */
    public static int[] quickSort(int[] array) {
        _quickSort(array, 0, array.length - 1);
        return array;
    }


    private static int getMiddle(int[] list, int low, int high) {
        int tmp = list[low];  //数组的第一个作为中轴
        while (low < high) {
            while (low < high && list[high] >= tmp) {
                high--;
            }
            list[low] = list[high];  //比中轴小的记录移到低端
            while (low < high && list[low] <= tmp) {
                low++;
            }
            list[high] = list[low];  //比中轴大的记录移到高端
        }
        list[low] = tmp;       //中轴记录到尾
        return low;          //返回中轴的位置
    }


    private static void _quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high); //将list数组进行一分为二
            _quickSort(list, low, middle - 1);   //对低字表进行递归排序
            _quickSort(list, middle + 1, high);    //对高字表进行递归排序
        }
    }

}

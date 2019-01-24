package com.uzykj.algorithm.chooseSort;

/**
 * @author ghostxbh
 * @date 24/01/2019 10:34
 * @className 选择排序
 * 选择排序的主要优点与数据移动有关。如果某个元素位于正确的最终位置上，则它不会被移动。
 * 选择排序每次交换一对元素，它们当中至少有一个将被移到其最终位置上，因此对n个元素的表进行排序总共进行至多n-1次交换。
 * 在所有的完全依靠交换去移动元素的排序方法中，选择排序属于非常好的一种。
 */
public class ChooseSort {
    /**
     * @param array
     * @return int[]
     * @MethodName 选择排序
     * @MethodDescribe 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
     */
    public static int[] selectSort(int[] array) {
        int pos;
        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            pos = i;
            int temp = array[i];
            for (; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    pos = j;
                }
            }
            array[pos] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
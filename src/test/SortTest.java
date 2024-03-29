package test;


import com.uzykj.algorithm.sort.exchangeSort.QuickSort;

import java.util.Arrays;

public class SortTest {
    // 排序原始数据
    private static final int[] NUMBERS =
            {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    public static void main(String[] args) {
        int[] insertSort = QuickSort.quickSort(NUMBERS);
        System.out.println(Arrays.toString(insertSort));
    }
}

package ru.algorithms.sort.bubble_sort;

import java.util.Arrays;

public class BubbleSortDemo {

    public static void main(String[] args) {
        var bubbleSort = new BubbleSort();
        int array[] = {3, 0, 1, 6, 2, 5, 4};
        System.out.println("Before sorting: " + Arrays.toString(array));
        bubbleSort.optimizedBubbleSort(array);
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}

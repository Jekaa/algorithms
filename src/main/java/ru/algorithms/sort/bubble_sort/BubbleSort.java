package ru.algorithms.sort.bubble_sort;

import java.util.stream.IntStream;

public class BubbleSort {

    void bubbleSort(int[] array) {
        int n = array.length;
        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    if (array[j - 1] > array[j]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                });
    }

    public void optimizedBubbleSort(int[] array) {
        int i = 0;
        boolean swapNeeded = true;
        while (i < array.length - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }
    }
}

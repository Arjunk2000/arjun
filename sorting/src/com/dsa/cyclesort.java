package com.dsa;

import java.util.Arrays;

import static com.dsa.selction.swap;

public class cyclesort {
    public static void main(String[] args) {
int [] arr={3,4,5,2,1};
cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
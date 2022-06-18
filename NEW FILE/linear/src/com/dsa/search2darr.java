package com.dsa;

import java.util.Arrays;

public class search2darr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 25, 5, 6, 546, 89,},
                {1235, 5, 6, 8, 6, 4, 8,},
                {548, 2, 5, 8, 6, 4, 7, 8, 6,},
                {47, 5, 9, 9, 123545}
        };
        int target = 8;
        int[] ans = search(arr, target);
        int high = max(arr);
        System.out.println(high);
        System.out.println(Arrays.toString(ans));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                if (arr[rows][col] > max) {
                    max = arr[rows][col];
                }
            }
        }
        return max ;
    }





    private static int[] search(int[][] arr, int target) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                if( arr[rows][col]== target){
                    return new int[]{rows, col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}



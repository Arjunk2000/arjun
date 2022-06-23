package com.dsa;

public class orderagnosticsBS {
    public static void main(String[] args) {
//        int[] arr = {8, 9, 25, 366, 2145, 5654}; /// for ascendig numbrer
        int [] arr = {99,98,97,96,95,0,-1}; // for decending nums
        int target = -1;
        int ans = orderagnostics(arr, target);
        System.out.println(ans);
    }

    private static int orderagnostics(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isasc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}


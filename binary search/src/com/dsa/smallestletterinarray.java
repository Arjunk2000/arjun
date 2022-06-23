package com.dsa;

public class smallestletterinarray {
    int [] arr={'a','j','l'};
    int target='k';
    int ans=findletter(arr,target);

    static int findletter(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//        if (target1 > arr1[arr1.length - 1])
//            return -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return arr[start%arr.length-1];

    }
}

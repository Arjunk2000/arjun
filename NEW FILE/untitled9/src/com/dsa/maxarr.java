package com.dsa;

public class maxarr {
    public static void main(String[] args) {
        int[]arr={2,4,3,45,3,244,4,};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,5));
    }
    public static int maxrange(int[] arr,int start,int end ) {
        int maxvalue = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxvalue)
                maxvalue = arr[i];
        }
        return maxvalue;

    }

    static int max(int[] arr) {
        int maxvalue=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>maxvalue)
                maxvalue=arr[i];
        }
return maxvalue;

    }
}

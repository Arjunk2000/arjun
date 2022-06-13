package com.dsa;

public class reverse {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        rev(arr);
        System.out.println(arr);
    }

    static void rev(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while(start<end){
            for (int i = start; i <end ; i++) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }

        }

    }
}

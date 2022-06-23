package com.dsa;

import java.util.Arrays;

public class selction {
    public static void main(String[] args) {
        int[] arr= {5,3,4,2,1};
       insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sel1(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int end=arr.length-i-1;
            int maxindex=getmax(arr,0, end);
            swap(arr,maxindex,end);

        }

    }

    static void insertion(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }

        }
    }

    static void swap(int [] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    static int  getmax(int [] arr, int start, int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}

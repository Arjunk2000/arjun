package com.dsa;

import java.util.Arrays;

import static com.dsa.selction.swap;

public class missingnumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        number(arr);
        System.out.println(number(arr));


    }

    static int number(int [] arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;
    }

}

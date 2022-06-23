package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.dsa.selction.swap;

public class allmissing {
    public static void main(String[] args) {
        int [] arr ={1,0,3};
        number1(arr);
        System.out.print(number1(arr));


    }

    static List<Integer> number1(int [] arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]!=index+1){
                ans.add(index+1) ;
            }

        }
        return ans;
    }

}


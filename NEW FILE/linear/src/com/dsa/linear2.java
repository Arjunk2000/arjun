package com.dsa;

import java.util.Scanner;

public class linear2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("size");
    int size= sc.nextInt();
        System.out.println("arrays");
    int [ ] arr=new int[size];
        for(int i=0;i< arr.length;i++){
        arr[i]=sc.nextInt();
    }
        System.out.println("target");
    int n=sc.nextInt();
    int ans=linearsearch2(arr,n);
        System.out.println(ans);

}
    static int linearsearch2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            int element= arr[i];
            if (element==target){
                return element;
            }
        }
        return -1;

    }
}


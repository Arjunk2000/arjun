package com.dsa;

public class evendigits {
    public static void main(String[] args) {
        int[] arr = {12, 255, 3632, 445, 20};
        int ans = findnumber(arr);
        System.out.println(ans);
    }

    private static int findnumber(int[] arr) {
        int count=0;
        for(int num=arr){
            if(even(num )){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int arr) {
        int numberofdigits = digits(arr);
        if (numberofdigits % 2 == 0){
            return true;
        }
        return   false;
    }

    private static int digits(int arr) {
        int count=0;
        while(arr>0){
            count++;
            arr=arr/10;
        }
        return count;
    }
}

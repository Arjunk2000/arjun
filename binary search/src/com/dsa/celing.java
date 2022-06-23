package com.dsa;

public class celing {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,12,16};
        int target=9;
        int [] arr1 = {2,3,4,5,6,7,8,12,16};
        int target1=13;
        int ans= celing1(arr,target);
        int ans1= floor(arr1,target1);
        System.out.println(ans);
        System.out.println(ans1);

    }

    private static int floor(int[] arr1, int target1) {
        int start = 0;
        int end = arr1.length - 1;

//        if (target1 > arr1[arr1.length - 1])
//            return -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target1 < arr1[mid]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return end;
    }

    static int celing1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

       if (target > arr[arr.length - 1])
           return -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
        if (target < arr[mid]){
             end = mid-1;
        }else{
            start= mid+1;
        }
        }
return start;

    }
}
/// while(start<=end){
//            int mid= start+ (end-start)/2;
//            if(target<arr[mid])
//                end=mid-1;
//            else if(target>arr[mid])
//                    start=mid+1;
//                 else
//                     return mid;
//
//        }
//         return -1;
//    }

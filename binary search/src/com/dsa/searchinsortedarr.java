package com.dsa;

public class searchinsortedarr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};

        System.out.println(ispivot(arr,3));
    }


    static int ispivot(int [] arr,int target ){
        int ispivot=pivot(arr);

        if (ispivot==-1){
            return bs(arr,target,0,arr.length-1);
        }
        if(arr[ispivot]==target)
            return ispivot;
        if(target>=arr[0])
            return bs(arr,target,0,ispivot-1);

                    else
                        return bs(arr, target , ispivot+1, arr.length-1);


    }

    static int bs(int [] arr, int target, int start, int end){
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;

        }
        return -1;
    }


static int pivot(int[]arr ){
    int start=0;
    int end =arr.length-1;

    while(start<=end){
        int mid= start+(end-start)/2;

        if (mid<end && arr[mid]>arr[mid+1]){
            return mid;
        }
        if (mid >start && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if(arr[mid]<=arr[start])
            end=mid-1;
        else{
            start=mid+1;
    }


    }
    return -1;
}
}
package com.dsa;

import java.util.Arrays;

public class bsin2d {
    public static void main(String[] args) {
              int [][] arr={
                      {2,3,4,5},
                      {6,7,8,9},
                      {10,11,12,13}

              };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    static int[] search(int [][] matrix,int target){
        int r=0;
        int c=matrix[0].length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            if (matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}

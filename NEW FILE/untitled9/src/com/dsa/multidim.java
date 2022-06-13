package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class multidim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int col =sc.nextInt();
        int[][] arr = new int[rows][col];
        for (int row = 0; row < arr.length; row++) {
            for ( col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

            //output
//            for ( int row = 0; row < arr.length; row++) {
//                for (   col = 0; col < arr[row].length; col++) {
//                    System.out.print(arr[row][col] +" ");
//                }
//                System.out.println();
//        }

//        for ( int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[rows]));
//    }

//        for(int[]a : arr){
//            System.out.println(a);
    }}


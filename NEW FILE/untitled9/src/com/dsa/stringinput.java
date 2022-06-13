package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class stringinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        String [] str=new String[size];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }
//        for (int i = 0; i <str.length; i++) { long method  for printing
//            System.out.println(str[i]);
//        }
        System.out.println(Arrays.toString(str)); //short method for printing
    }
}

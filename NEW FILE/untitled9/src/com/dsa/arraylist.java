package com.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> list =new ArrayList<>();
//        list.add(68);
//        list.add(68);
//        list.add(68);
//        list.add(68);
//        list.add(68);list.add(68);list.add(68);
//        list.add(68);list.add(68);list.add(68);list.add(68);

// input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
//output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }


    }

}

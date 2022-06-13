package com.dsa;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(isprime(n));
        for (int i=1;i<n;i++)
            if(isprime(i))
                System.out.print(i+ " ");
    }

    private static boolean isprime(int n) {
        int original = n;

        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return original == sum;
    }


}

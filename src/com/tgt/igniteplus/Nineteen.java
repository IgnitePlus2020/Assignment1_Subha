package com.tgt.igniteplus;

import java.util.Scanner;
public class Nineteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0, n;
        System.out.println("Enter a number:");
        n = in.nextInt();
        int arr[]=new int[32];
        while(n>0)
        {
            arr[i++]=n%2;
            n/=2;
        }
        System.out.println("Binary equivalent of given number :");

        for(int j=i-1;j>=0;j--)
            System.out.print(arr[j]);
    }
}

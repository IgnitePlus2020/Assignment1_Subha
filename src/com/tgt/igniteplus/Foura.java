package com.tgt.igniteplus;

import java.util.Scanner;

public class Foura {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter the value of a:");
        a= in.nextInt();
        System.out.println("Enter the value of b:");
        b= in.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a="+a+" and b="+b);

    }
}

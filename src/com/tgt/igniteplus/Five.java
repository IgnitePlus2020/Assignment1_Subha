package com.tgt.igniteplus;
import java.util.Scanner;
public class Five {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter a number:");
        a = in.nextInt();
        if(a%2==0)
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }
}

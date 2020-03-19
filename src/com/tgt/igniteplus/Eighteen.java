package com.tgt.igniteplus;
import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n,fact=1;
        System.out.println("Enter a number:");
        n = in.nextInt();
        for(i=1;i<=n;i++)
            fact*=i;
        System.out.println("Factorial= "+fact);
    }
}

package com.tgt.igniteplus;
import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n,rev=0,dig;

        System.out.println("Enter a number:");
        n = in.nextLong();
        while(n!=0)
        {
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        System.out.println("Reverse="+rev);
    }
}

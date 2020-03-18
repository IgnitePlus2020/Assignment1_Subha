package com.tgt.igniteplus;
import java.util.Scanner;
public class Eight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,evensum,oddsum;
        System.out.println("Enter a number:");
        n = in.nextInt();
        if(n%2==0) {
            n=n/2;
            evensum = n * (n + 1);
            oddsum = n * n;
        }
        else
        {   n=n/2;
            evensum = n * (n + 1);
            oddsum =( n+1 )*(n+1);
        }
        System.out.println("Even sum="+evensum);
        System.out.println("Odd sum="+oddsum);
    }
}

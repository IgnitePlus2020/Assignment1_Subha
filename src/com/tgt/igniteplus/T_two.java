package com.tgt.igniteplus;
import java.util.Scanner;
public class T_two {
    //series 1, 1, 2, 3, 5, 8, 13...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, n,a=1,b=1,c;
        System.out.println("Enter the number of terms:");
        n = in.nextInt();
        System.out.println("Series with " + n + "terms : ");
        System.out.print(a+" "+b+" ");
        for (i = 3; i <= n; i++)
        {   c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}

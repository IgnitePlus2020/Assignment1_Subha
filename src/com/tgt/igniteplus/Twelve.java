package com.tgt.igniteplus;
import java.util.Scanner;
public class Twelve {
    //series -1,2,-3,4,-5...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i;
        System.out.println("Enter a number:");
        n = in.nextInt();
        System.out.println("Series till " + n + " :");
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
                System.out.print(-i+" ");
            else
                System.out.print(i+" ");
        }
        System.out.println();

    }
}

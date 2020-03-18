package com.tgt.igniteplus;
import java.util.Scanner;
public class Two {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=in.nextInt();
        int i,j,s;
        for(i=1;i<=num;i++)
        {
            for(s=1;s<=num-i;s++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

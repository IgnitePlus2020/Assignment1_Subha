package com.tgt.igniteplus;
import java.util.Scanner;
//question-one
public class One {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=in.nextInt();
        int i,j;
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

package com.tgt.igniteplus;
import java.util.Scanner;
public class T_four {
    //x to the power n
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,n,ans=1,i;
        System.out.println("Enter x and n:");
        x = in.nextInt();
        n = in.nextInt();
        for(i=1;i<=n;i++)
            ans*=x;
        System.out.println(x+" to the power "+n+" ="+ans);
    }
}

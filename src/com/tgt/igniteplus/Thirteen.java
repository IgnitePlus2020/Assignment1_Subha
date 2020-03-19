package com.tgt.igniteplus;
import java.util.Scanner;
import java.lang.Math;
public class Thirteen {
    //series 1,4,27,256,3125...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, ans, i;
        double power;
        System.out.println("Enter a number:");
        n = in.nextInt();
        System.out.println("Series till " + n + " :");
        ans = 1;
        i = 1;
        while (ans <= n) {
            System.out.print(ans+" ");
            i++;
            power=Math.pow(i,i);
            ans=(int)power;

        }
        System.out.println();

    }
}

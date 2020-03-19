package com.tgt.igniteplus;
import java.util.Scanner;
public class Eleven {
     //series 4,16,36,64...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, ans, i;
        System.out.println("Enter a number:");
        n = in.nextInt();
        System.out.println("Series till " + n + " :");
        ans = 4;
        i = 2;
        while (ans <= n) {
            System.out.print(ans+" ");
            ans=4*i*i;
            i++;

        }
        System.out.println();
    }
}

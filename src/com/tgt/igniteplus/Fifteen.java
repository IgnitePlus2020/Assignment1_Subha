package com.tgt.igniteplus;
import java.util.Scanner;
public class Fifteen {

    //series 1,4,9,25,36,49...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans, i,n;
        System.out.println("Enter a number:");
        n = in.nextInt();
        System.out.println("Series till " + n + " :");
        ans=1;i=1;
        while (ans <= n) {
            System.out.print(ans + " ");
            i++;
            if(i%4==0)
                i++;
            ans=i*i;

        }
    }
}

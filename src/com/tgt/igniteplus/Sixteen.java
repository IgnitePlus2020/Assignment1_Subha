package com.tgt.igniteplus;
import java.util.Scanner;
public class Sixteen {
    //series 1,5,13,29,49,77...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans, i,n;
        System.out.println("Enter a number:");
        n = in.nextInt();
        System.out.println("Series till " + n + " :");
        ans=1;i=0;
        while (ans <= n) {
            System.out.print(ans + " ");
            i++;
            if(i%3==0)
                i++;
            ans=ans+(4*i);

        }
    }
}

package com.tgt.igniteplus;

import java.util.Scanner;
public class Twenty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, n,deci=0,power,digit;
        System.out.println("Enter a binary number:");
        n = in.nextInt();
        power=1;
        while(n!=0)
        {
            digit=n%10;
            n/=10;
            deci+=digit*power;
            power*=2;
        }
        System.out.println("Decimal equivalent = "+deci);

    }
}

package com.tgt.igniteplus;
import java.util.Scanner;
public class Six {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fraction,whole,n;
        System.out.println("Enter a floating point number:");
        n = in.nextDouble();
        fraction=n%1;
        whole=n-fraction;
        System.out.println("Number="+n+"\nWhole number="+whole+"\nFractional part="+fraction);
    }
}

package com.tgt.igniteplus;
import java.util.Scanner;
public class Fourb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter the value of a:");
        a = in.nextInt();
        System.out.println("Enter the value of b:");
        b = in.nextInt();
        System.out.println("Enter the value of c:");
        c = in.nextInt();

        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);

        System.out.println("After swapping: a="+a+", b="+b+" and c="+c);

    }
}

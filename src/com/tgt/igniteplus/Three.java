package com.tgt.igniteplus;
import java.util.Scanner;
public class Three {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p,t,r,si;
        System.out.println("Enter principal:");
        p = in.nextFloat();
        System.out.println("Enter time period:");
        t = in.nextFloat();
        System.out.println("Enter rate of interest:");
        r = in.nextFloat();
        si=p*t*r/100;
        System.out.println("Simple interest= "+si);


    }
}

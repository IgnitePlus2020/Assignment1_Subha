package com.tgt.igniteplus;
import java.util.Scanner;
import java.lang.String;
public class T_five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s,rev="";
        int i,len;
        System.out.println("Enter a string:");
        s = in.nextLine();
        len=s.length();
        for(i=len-1;i>=0;i--)
            rev=rev+ s.charAt(i);
        System.out.println("Reverse= "+rev);

    }
}

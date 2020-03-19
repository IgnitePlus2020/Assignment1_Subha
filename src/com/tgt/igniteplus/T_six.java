package com.tgt.igniteplus;
import java.util.Scanner;
import java.lang.String;
public class T_six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s; char[] s1;
        int i,len,flag=0;
        System.out.println("Enter a string:");
        s = in.nextLine();
        len=s.length();
        s1=s.toCharArray();
        for(i=0;i<len;i++)
        {
            if(s1[i]!=s1[len-1-i]) {
                flag = 1;
                break;
            }

        }
        if(flag==0)
            System.out.println("Given string is a palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}

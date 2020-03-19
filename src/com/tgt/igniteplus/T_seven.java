package com.tgt.igniteplus;
import java.util.Scanner;
public class T_seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n,dig,number,sum=0;
        System.out.println("Enter a number:");
        n = in.nextInt();
        number=n;
        while(n!=0)
        {
            dig=n%10;
            sum+=dig*dig*dig;
            n/=10;
        }
        if(sum==number)
            System.out.println("Given number is an Armstrong number");
        else
            System.out.println("Given number is not an Armstrong number");
    }
}

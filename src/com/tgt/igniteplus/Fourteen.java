package com.tgt.igniteplus;
import java.util.Scanner;
public class Fourteen {
    //series 1,4,7,12,23...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=1,b=4,c=7,n,sum;
        System.out.println("Enter a number(>=7):");//because 1,4,7 are initial numbers and the numbers after these are obtained by adding previous three numbers
        n = in.nextInt();
        System.out.println("Series till " + n + " :");
        System.out.print(a+" "+b+" "+c+" ");
        sum=a+b+c;
        while(sum<=n)
        {   System.out.print(sum+" ");
            a=b;
            b=c;
            c=sum;
            sum=a+b+c;
        }

    }
}

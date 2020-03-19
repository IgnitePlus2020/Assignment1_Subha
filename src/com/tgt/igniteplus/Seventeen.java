package com.tgt.igniteplus;
import java.lang.Math;
import java.util.Scanner;

public class Seventeen {
    static boolean isPrime(int n)
    {int s=(int)Math.sqrt(n);
     for(int i=2;i<=s;i++)
     {
         if(n%i==0)
             return false;
     }
      return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,i;
        System.out.println("Enter n and m:");
        n = in.nextInt();
        m = in.nextInt();
        for(i=n+1;i<m;i++)
        {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }

}

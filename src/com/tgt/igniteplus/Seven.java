package com.tgt.igniteplus;
import java.util.Scanner;
public class Seven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b,c;
        System.out.println("Enter three numbers:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if(a>=b && a>=c)
        {   System.out.println("largest="+a);
            if(b>=c)
                System.out.println("Second largest="+b);
            else
                System.out.println("Second largest="+c);
        }
        else if(b>=c)
        {   System.out.println("largest="+b);
            if(a>=c)
                System.out.println("Second largest="+a);
            else
                System.out.println("Second largest="+c);
        }
        else
        {   System.out.println("largest="+c);
            if(a>=b)
                System.out.println("Second largest="+a);
            else
                System.out.println("Second largest="+b);

        }
    }
}

package com.tgt.igniteplus;
import java.util.Scanner;
public class T_three {
    //series 1, -2, 4, -6, 7, -10, 10, -14 ...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n,count=0;
        System.out.println("Enter the number of terms:");
        n = in.nextInt();
        System.out.println("Series with " + n + "terms : ");
        for(i=1,j=-2;;i+=3,j-=4)
        {   if(count>=n)
                break;
            System.out.print(i+" ");
            count++;
            if(count>=n)
                break;
            System.out.print(j+" ");
            count++;
        }

    }
}

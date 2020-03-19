package com.tgt.igniteplus;
import java.util.Scanner;
public class T_one {
    //series 1, -2, 6, -15, 31, -56...
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, n,ans=1;
        System.out.println("Enter the number of terms:");
        n = in.nextInt();
        System.out.println("Series with "+n+"terms : ");
        for(i=1;i<=n;i++)
        {   if(i%2==0)
                System.out.print(-ans+" ");
            else
                System.out.print(ans+" ");
            ans+=(i*i);
        }
    }
}

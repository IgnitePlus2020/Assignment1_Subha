package com.tgt.igniteplus;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i=0,dig,l=0;
        int arr[]=new int[10];
        System.out.println("Enter a number:");
        n = in.nextInt();
        String word[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        do
        {
            dig=n%10;
            arr[i]=dig;
            n=n/10;
            i++;
        }while(n!=0);
        for(l=i-1;l>=0;l--)
            System.out.print(word[arr[l]]+" ");
    }
}

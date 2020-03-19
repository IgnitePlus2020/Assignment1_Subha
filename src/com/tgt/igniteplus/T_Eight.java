package com.tgt.igniteplus;
import java.util.Scanner;
public class T_Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n,key,flag=0;
        System.out.println("Enter the number of elements:");
        n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println("Enter the key to be searched:");
        key=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Key not found!");
        else
            System.out.println("Key found at position "+(i+1));
    }
}

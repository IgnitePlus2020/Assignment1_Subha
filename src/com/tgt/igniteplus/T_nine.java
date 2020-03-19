package com.tgt.igniteplus;
import java.util.Scanner;
public class T_nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n,key,flag=0;
        System.out.println("Enter the number of elements:");
        n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for(i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println("Enter the key to be searched:");
        key=in.nextInt();
        int low=0,high=n-1,mid=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(key<arr[mid])
                high=mid-1;
            else if (key==arr[mid])
            {
                flag=1;
                break;
            }
            else
                low=mid+1;
        }

        if(flag==0)
            System.out.println("Key not found!");
        else
            System.out.println("Key found at position "+(mid+1));
    }
}

/*Write a program to:
Input n (size of array)
Input n integers into the array
Find the span (max - min)
Print the span value*/

import java.util.*;
public class span
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

     
        System.out.println("Enter integers to an array.");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
           int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        int span = max - min;
        System.out.println("The Answer is "+ span);
        sc.close();
    }
}
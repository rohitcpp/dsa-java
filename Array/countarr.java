/* Write a program to:
Input n (size of array)
Input n integers into the array
Count how many even and odd numbers are present
Print both counts */

import java.util.*;
public class countarr
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter numbers to be store in the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int counteven=0;
        int countodd=0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]%2==0)
            {
                counteven++;
            }
            else
            {
                countodd++;
            }
        }
        System.out.println("Even Numbers: "+ counteven);
        System.out.println("Odd Numbers: "+ countodd);
        sc.close();
    }
}
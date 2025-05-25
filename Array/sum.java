import java.util.*;
public class sum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenth of the 1st array");
        int n1= sc.nextInt();
        int[] arr1= new int[n1];
        System.out.println("Enter elements of first array");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter lenth of the 2nd array");
        int n2= sc.nextInt();
        int[] arr2= new int[n2];
        System.out.println("Enter elements of 2nd array");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }

        int maxlen= Math.max(n1,n2);
        int[] sum= new int[n1 > n2? n1+1:n2+1];
        int c=0;

        int i= n1-1;
        int j= n2-1;
        int k= maxlen;

        while(i>=0 || k>=0 || c>0)
        {
            int d=c;
            if(i>=0)
            {
                d=d+arr1[i--];
            }
            if(j>=0)
            {
                d=d+arr2[j--];
            }

            sum[k--]=d%10;
            c=d/10;
        }
        System.out.println("Result: ");
        boolean leadingZero= true;
        for(int val:sum)
        {
            if(val!=0)
            {
                leadingZero=false;
            }
            if(!leadingZero){
            System.out.print(val);
        }}

        if(leadingZero)
        {
            System.out.println(0);
        }
          sc.close();
    }
  
}
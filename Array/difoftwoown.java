import java.util.*;
public class difoftwoown
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lenght of 1st array");
        int n1= sc.nextInt();
        int[] arr1= new int[n1];
        System.out.println("Enter elements for 1st array");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]= sc.nextInt();
        }

        System.out.println("Enter lenght of 2nd array");
        int n2= sc.nextInt();
        int[] arr2= new int[n2];
        System.out.println("Enter elements for 2nd array");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]= sc.nextInt();
        }

        int[] diff= new int[n2];
        int c=0;

        int i=n1-1;
        int j=n2-1;
        int k=diff.length-1;

        while(k>=0)
        {
            int d=0;
            int av1= i>=0 ? arr1[i]:0;

            if(arr2[j]+c>=av1)
            {
                d=arr2[j]+c-av1;
                c=0;
            }
            else
            {
                d=arr2[j]+c+10-av1;
                c=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        sc.close();
        boolean leadingZero=true;
        for(int val:diff)
        {
            if(val!=0){
            leadingZero=false;
        }
        if(!leadingZero)
        {
            System.out.print(val);
        }
        }   
        if(leadingZero)
        {
            System.out.println(0);
        }
    }
}
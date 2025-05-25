import java.util.Scanner;

public class Sumar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.println("Enter size of ar1 ");
        n = sc.nextInt();
        int[] ar1 = new int[n];

        System.out.println("Enter size of ar2");
        m = sc.nextInt();
        int[] ar2 = new int[m];

        System.out.println("Enter " + n + " values for ar1 ");
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }

        System.out.println("Enter " + m + " values for ar2 ");
        for (int i = 0; i < m; i++) {
            ar2[i] = sc.nextInt();
        }

        // Assume max size result is max(n, m) + 1 (for carry)
        int maxLen = Math.max(n, m);
        int[] ars = new int[maxLen + 1];

        int carry = 0;
        
        for (int k = maxLen,i = n-1 ,j=m-1; k>=0; k--,j--,i--  ){
             int dig1 = (i >= 0) ? ar1[i] : 0;
             int dig2 = (j >= 0) ? ar2[j] : 0;

            int sum = dig1 + dig2 + carry;
            ars[k]=sum%10;
            carry= sum /10;
        }
        System.out.print("Sum = ");
        int start = (ars[0] == 0) ? 1 : 0;
        for (int i = start; i < ars.length; i++) {
            System.out.print(ars[i]);
        }
        System.out.println();
    
    }
}

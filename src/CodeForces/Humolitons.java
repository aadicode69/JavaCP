package CodeForces;

import java.util.Scanner;

public class Humolitons {
    public static boolean arraySortedOrNot(int a[], int n){
        if (n == 1 || n == 0) {
            return true;
        }
        for (int i = 1; i < n; i++) {
            if(a[i-1] > a[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t=myobj.nextInt();

        for (int j = 1; j <= t; j++) {
            int n = myobj.nextInt();
            int k = myobj.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=myobj.nextInt();
            }
            if(arraySortedOrNot(arr,arr.length) || k>1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        myobj.close();
    }
}

package CSES;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long  c=0;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                c += arr[i]-arr[i+1];
                arr[i+1] = arr[i];
            }
        }
        System.out.println(c);
        sc.close();

    }
}

package CodeForces;

import java.util.Scanner;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            for(int j=1; j<n;j++){
                if(j%2==0){
                    arr[j]=arr[j-1]+arr[j];
                }else{
                    arr[j]=arr[j-1]-arr[j];
                }
            }
            System.out.println(arr[n-1]);
        }
        sc.close();
    }
}
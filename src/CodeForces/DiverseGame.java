package CodeForces;

import java.util.Scanner;

public class DiverseGame {
    public static void arrange(int[][] a){
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[i][j];
            }
        }
        if(b.length <= 1 && b[0].length <= 1){
            System.out.println(1);
        }else{
            if(b.length%2==0){
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 1; x<=t; x++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for(int i =0; i<n; i++){
                for(int j =0; j<m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            arrange(arr);
        }
    }
}

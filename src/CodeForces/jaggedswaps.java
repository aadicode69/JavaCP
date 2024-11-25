package CodeForces;

import java.util.Scanner;

public class jaggedswaps {
    public static boolean isSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isSorted = false;
                break;
            }else{
                continue;
            }
        }
        return isSorted;
    }
    public static boolean jaggedswaps(int[] a){
        int n = a.length;
        if(n<=2){
            return false;
        }else if(isSorted(a)){
            return true;
        }else if(n>=3){
            for(int i=1;i<n;i=i+2){
                if(i==n-1){
                    return false;
                }else if(a[i]>a[i-1] && a[i]>a[i+1]){
                    int temp;
                    temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
//                    return true;
                }else{
                    return false;
                }
            }
        }else{
            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 0; t< tc; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            if(jaggedswaps(arr)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

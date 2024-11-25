package CSES;
import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int[] even = new int[n];
        int[] odd = new int[n];
        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evenIndex++] = arr[i];
            }else{
                odd[oddIndex++] = arr[i];
            }
        }
        int[] beautiful = new int[n];
        int idx = 0;
        for (int i = 0; i < evenIndex; i++) {
            beautiful[idx++] = even[i];
        }
        for (int i = 0; i < oddIndex; i++) {
            beautiful[idx++] = odd[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(beautiful[i] + " ");
        }
        sc.close();
    }
}

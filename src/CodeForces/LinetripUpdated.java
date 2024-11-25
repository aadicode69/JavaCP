package CodeForces;

import java.util.Scanner;

public class LinetripUpdated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int l = 0; l < t; l++) {
            int n = in.nextInt();
            int x = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            int res1 = 0;
            int res = 0;

            if (n == 1) {
                res1 = 2 * (x - arr[0]);
                res = arr[0];
            } else {
                res1 = 2 * (x - arr[n - 1]);
                int maxDifference = arr[0];

                for (int i = 1; i < n; i++) {
                    int diff = arr[i] - arr[i - 1];
                    maxDifference = Math.max(maxDifference, diff);
                }
                res = maxDifference;
            }

            System.out.println(Math.max(res1, res));
        }
        in.close();
    }
}

package CSES;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += sc.nextInt();
        }

        long missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);

        sc.close();
    }
}

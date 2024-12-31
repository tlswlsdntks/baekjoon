package level3.level3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
         */
        Scanner scanner = new Scanner(System.in);
        long n;
        do {
            n = scanner.nextInt();
        } while (1 > n || n > 10_000);
    }
}

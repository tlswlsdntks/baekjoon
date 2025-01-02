package level3.level3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        do {
            n = scanner.nextInt();
        } while (1 > n || n > 10_000);

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
    }
}

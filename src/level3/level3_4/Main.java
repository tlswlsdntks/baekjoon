package level3.level3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, n, a, b, c = 0, t = 0;
        do {
            x = scanner.nextInt();
            n = scanner.nextInt();
        } while ((1 > x || x > 1_000_000_000) || (1 > n || n > 100));

        int[][] products = new int[n][2];
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
            products[c][0] = a;
            products[c][1] = b;
        } while ((1 > a || a > 1_000_000) || (1 > b || b > 10) || ++c < n);

        for (int i = 0; i < products.length; i++) {
            t += (products[i][0] * products[i][1]);
        }
        System.out.println(x == t ? "Yes" : "No");
    }
}

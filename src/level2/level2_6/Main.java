package level2.level2_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        } while ((0 > a || a > 23) || (0 > b || b > 59) || (0 > c || c > 1_000));

        b += c;
        a += b / 60;
        b %= 60;
        if (a > 23) {
            a -= 24;
        }
        System.out.println(a);
        System.out.println(b);
    }
}

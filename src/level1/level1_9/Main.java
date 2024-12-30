package level1.level1_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b, c;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        } while ((2 > a || a > 10_000) || (2 > b || b > 10_000) || (2 > c || c > 10_000));
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}

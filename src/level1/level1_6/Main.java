package level1.level1_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (1 > a || b > 10_000);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
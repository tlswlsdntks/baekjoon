package level1.level1_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b, c;
        long pow = (long) Math.pow(10, 12);
        do {
            a = scanner.nextLong();
            b = scanner.nextLong();
            c = scanner.nextLong();
        } while ((1 > a || a > pow) || (1 > b || b > pow) || (1 > c || c > pow));
        System.out.println(a + b + c);
    }
}

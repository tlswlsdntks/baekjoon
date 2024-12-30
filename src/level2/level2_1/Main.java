package level2.level2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b;
        do {
            a = scanner.nextLong();
            b = scanner.nextLong();
        } while ((-10_000 > a || a > 10_000) || (-10_000 > b || b > 10_000));
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}

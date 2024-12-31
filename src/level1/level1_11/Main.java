package level1.level1_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        int pow = (int) Math.pow(10, 12);
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        } while ((1 > a || a > pow) || (1 > b || b > pow) || (1 > c || c > pow));
        System.out.println(a + b + c);
    }
}

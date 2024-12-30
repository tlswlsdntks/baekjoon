package level1.level1_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(a * (b % 10));
        System.out.println(a * ((b / 10) % 10));
        System.out.println(a * ((b / 100) % 10));
        System.out.println(a * b);
    }
}

package level1.level1_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (0 >= a || b >= 10);
        System.out.println(a - b);
    }
}

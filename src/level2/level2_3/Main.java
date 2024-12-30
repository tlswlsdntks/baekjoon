package level2.level2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long year;
        do {
            year = scanner.nextLong();
        } while (1 > year || year > 4_000);
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

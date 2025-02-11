package level2.level2_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while ((-1_000 > x || x > 1_000 || x == 0) || (-1_000 > y || y > 1_000 || y == 0));

        if (isPositiveNumber(x) && isPositiveNumber(y)) {
            System.out.println(1);
        } else if (!isPositiveNumber(x) && isPositiveNumber(y)) {
            System.out.println(2);
        } else if (!isPositiveNumber(x) && !isPositiveNumber(y)) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }

    static boolean isPositiveNumber(int number) {
        return 0 < number;
    }
}

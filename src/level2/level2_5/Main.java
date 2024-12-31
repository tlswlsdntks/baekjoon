package level2.level2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, m;
        do {
            h = scanner.nextInt();
            m = scanner.nextInt();
        } while ((0 > h || h > 23) || (0 > m || m > 59));

        m -= 45;
        if (m < 0) {
            h -= 1;
            m += 60;
        }
        if (h < 0) {
            h += 24;
        }
        System.out.println(h);
        System.out.println(m);
    }
}

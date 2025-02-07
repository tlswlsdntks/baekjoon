package level4.level4_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            int j = scanner.nextInt();
            if (1 > j || j > 1_000) {
                i--;
            } else {
                a[i] = j % 42;
            }
        }
        a = Arrays.stream(a)
                .distinct().toArray();

        int b = a.length, c = 0;
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        c++;
                    }
                }
            }
        }

        System.out.println(b - c);
    }
}

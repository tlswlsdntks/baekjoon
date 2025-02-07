package level4.level4_7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[30];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        int[] b = new int[28];
        for (int i = 0; i < b.length; i++) {
            int j = scanner.nextInt();
            if (1 > j || j > 30) {
                i--;
            } else {
                b[i] = j;
            }
        }
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            boolean c = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c = true;
                }
            }
            if (!c) {
                System.out.println(a[i]);
            }
        }
    }
}

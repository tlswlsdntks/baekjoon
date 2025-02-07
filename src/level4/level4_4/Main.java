package level4.level4_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int j = scanner.nextInt();
            if (j >= 100) {
                i--;
            } else {
                boolean e = true;
                for (int k : arr) {
                    if (j == k) {
                        e = false;
                        i--;
                        break;
                    }
                }
                if (e) {
                    arr[i] = j;
                    if (arr[i] > max) {
                        max = arr[i];
                        count = i + 1;
                    }
                }
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}

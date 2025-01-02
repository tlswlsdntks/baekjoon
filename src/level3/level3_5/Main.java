package level3.level3_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
        } while (4 > n || n > 1_000);

        for (int i = 0; i < n / 4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}

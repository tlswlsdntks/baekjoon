package level1.level1_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        do {
            year = scanner.nextInt();
        } while (1_000 > year || year > 3_000);
        System.out.println(year -= 2541 % 1998);
    }
}

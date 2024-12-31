package level2.level2_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] dices = {scanner.nextLong(), scanner.nextLong(), scanner.nextLong()};
        if (dices[0] == dices[1] && dices[1] == dices[2]) {
            System.out.println(10_000 + (dices[1]) * 1_000);
        } else if (dices[0] == dices[1] || dices[0] == dices[2]) {
            System.out.println(1_000 + (dices[0]) * 100);
        } else if (dices[1] == dices[2]) {
            System.out.println(1_000 + (dices[1]) * 100);
        } else {
            System.out.println(Math.max(Math.max(dices[0], dices[1]), dices[2]) * 100);
        }
    }
}

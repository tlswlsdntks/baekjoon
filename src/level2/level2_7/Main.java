package level2.level2_7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] dices = getDices();
        for (long dice : dices) {
            System.out.println("dice = " + dice);
        }

        getPrice(2, 3, 6);
    }

    private static long[] getDices() {
        return new long[]{new Random().nextLong(6) + 1, new Random().nextLong(6) + 1, new Random().nextLong(6) + 1};
    }

    private static void getPrice(long count, long target, long max) {
        switch ((int) count) {
            case 3:
                System.out.println(10_000 + (target) * 1_000);
                break;
            case 2:
                System.out.println(1_000 + (target) * 100);
                break;
            case 1:
                System.out.println(max * 100);
                break;
        }
    }
}

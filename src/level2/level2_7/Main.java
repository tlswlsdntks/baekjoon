package level2.level2_7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long count = 0, target = 0, max = 0;
        for (long i = 0; i < getDices().length; i++) {
            if (max < i) {
                max = i;
            }
            if (target == i) {
                count++;
            }
            target = i;
        }
        getPrice(count, target, max);
    }

    private static long[] getDices() {
        return new long[]{new Random().nextLong(6) + 1, new Random().nextLong(6) + 1, new Random().nextLong(6) + 1};
    }

    private static void getPrice(long count, long target, long max) {
        System.out.println("count = " + count);
        System.out.println("target = " + target);
        System.out.println("max = " + max);
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

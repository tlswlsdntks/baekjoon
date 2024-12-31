package level3.level3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][] testCase = new int[t][2];
        setTestCase(t, scanner, testCase);
        getTestCaseTotalOfEach(t, testCase);
    }

    private static void setTestCase(int t, Scanner scanner, int[][] testCase) {
        int a, b, c = 0;
        while (c < t) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (0 < a && b < 10) {
                testCase[c][0] = a;
                testCase[c][1] = b;
                c++;
            }
        }
    }

    private static void getTestCaseTotalOfEach(int t, int[][] testCase) {
        for (int i = 0; i < t; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += testCase[i][j];
            }
            System.out.println(sum);
        }
    }
}

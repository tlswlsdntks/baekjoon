package level4.level4_10;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int a;
        boolean b = true;
        while (b) {
            a = Integer.parseInt(bufferedReader.readLine());
            if (1 > a || a > 1_000) {
                continue;
            }

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] c = new int[a];
            for (int i = 0; i < a; i++) {
                c[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            Arrays.sort(c);

            double h = 0;
            for (int i = 0; i < c.length; i++) {
                h += (double) c[i] / c[a - 1] * 100;
            }

            System.out.printf("%.2f", h / a);
            b = false;
        }
    }
}

package level4.level4_1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        boolean f = true;
        while (f) {
            int a = Integer.parseInt(bufferedReader.readLine()), b = 0, c, d = 0;
            if (1 > a || a > 100) {
                continue;
            }

            int[] e = new int[a];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < a; i++) {
                e[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            c = Integer.parseInt(bufferedReader.readLine());
            if (-100 > c || c > 100) {
                continue;
            }

            for (int i = 0; i < e.length; i++) {
                if (c == e[i]) {
                    d++;
                }
            }

            System.out.println(d);
            f = false;
        }
    }
}

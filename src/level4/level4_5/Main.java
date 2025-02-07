package level4.level4_5;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int a, b;
        boolean c = true;
        int[] d;
        while (c) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());

            if ((1 > a || a > 100) || (1 > b || b > 100)) {
                continue;
            }

            d = new int[a];
            for (int i = 0; i < b; i++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                int f = Integer.parseInt(stringTokenizer.nextToken());
                int l = Integer.parseInt(stringTokenizer.nextToken());
                int n = Integer.parseInt(stringTokenizer.nextToken());
                if ((1 > f || f > a) || (1 > l || l > a) || (1 > n || n > a)) {
                    i--;
                } else {
                    f -= 1;
                    l -= 1;
                    for (int j = f; j <= l; j++) {
                        d[j] = n;
                    }
                }
            }

            for (int i : d) {
                bufferedWriter.write(i + " ");
            }
            c = false;
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

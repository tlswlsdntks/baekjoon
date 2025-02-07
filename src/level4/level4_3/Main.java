package level4.level4_3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int a;
        int[] b;
        boolean c = true, d = true;
        while (c) {
            a = Integer.parseInt(bufferedReader.readLine());
            if (1 > a || a > 1_000_000) {
                continue;
            }

            b = new int[a];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < b.length; i++) {
                int j = Integer.parseInt(stringTokenizer.nextToken());
                if (-1_000_000 > j || j > 1_000_000) {
                    d = false;
                    break;
                }
                b[i] = j;
            }

            if (!d) {
                continue;
            }

            bufferedWriter.write(Arrays.stream(b).min().getAsInt() + " ");
            bufferedWriter.write(Arrays.stream(b).max().getAsInt() + " ");
            c = false;
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

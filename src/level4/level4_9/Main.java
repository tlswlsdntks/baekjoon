package level4.level4_9;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int a, b;
        boolean c = true;
        while (c) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());

            if ((1 > a || a > 100) || (1 > b || b > 100)) {
                continue;
            }

            int[] d = new int[a];
            for (int i = 0; i < d.length; i++) {
                d[i] = i + 1;
            }

            for (int i = 0; i < b; i++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                int f = Integer.parseInt(stringTokenizer.nextToken());
                int l = Integer.parseInt(stringTokenizer.nextToken());
                if ((1 > f || f > a) || 1 > l || l > a) {
                    i--;
                } else {
                    f -= 1;
                    l -= 1;
                    while (f < l) {
                        int temp = d[l];
                        d[l--] = d[f];
                        d[f++] = temp;
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

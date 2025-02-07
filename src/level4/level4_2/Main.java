package level4.level4_2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer, tokenizer;


        boolean d = true;
        while (d) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            if (1 > a || 10_000 < b) {
                continue;
            }

            int[] c = new int[a];
            tokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < c.length; i++) {
                c[i] = Integer.parseInt(tokenizer.nextToken());
            }

            for (int i : c) {
                if (b > i) {
                    bufferedWriter.write(i + " ");
                }
            }
            d = false;
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

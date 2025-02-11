package level3.level3_11;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b;
        boolean c = true;
        while (c) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            if (a <= 0 && b >= 10) {
                continue;
            }

            if (a == 0 && b == 0) {
                c = false;
            } else if (a != 0 && b != 0) {
                bufferedWriter.write(a + b + "\n");
            }
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

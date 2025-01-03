package level3.level3_6;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, b, c = 0, t;
        do {
            t = Integer.parseInt(bufferedReader.readLine());
        } while (t > 1_000_000);

        while (c < t) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            if ((1 <= a && a <= 1_000) && (1 <= b && b <= 1_000)) {
                bufferedWriter.write(a + b + "\n");
                c++;
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

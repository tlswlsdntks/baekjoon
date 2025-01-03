package level3.level3_8;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int a, b, c = 0, t;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        t = Integer.parseInt(bufferedReader.readLine());
        while (c < t) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            if (0 < a && b < 10) {
                bufferedWriter.write("Case #" + ++c + ": " + a + " + " + b + " = " + (a + b) + "\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

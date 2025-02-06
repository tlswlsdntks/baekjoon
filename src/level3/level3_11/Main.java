package level3.level3_11;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b;
        boolean c = true;
        do {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            if (0 < a && 0 < b) {
                bufferedWriter.write(a + b + "\n");
            } else {
                c = false;
            }
        } while (c);

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

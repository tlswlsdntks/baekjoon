package level3.level3_6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c = 0, t;
        int[][] testCase = null;
        do {
            t = Integer.parseInt(bufferedReader.readLine());
            testCase = new int[t][2];
        } while (t > 1_000_000);

        do {
            String[] s = bufferedReader.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            testCase[c][0] = a;
            testCase[c][1] = b;
        } while ((1 > a || a > 1_000) || (1 > b || b > 1_000) || ++c < t);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testCase.length; i++) {
            bufferedWriter.write(testCase[i][0] + testCase[i][1] + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

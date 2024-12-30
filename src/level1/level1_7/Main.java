package level1.level1_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = "";
        do {
            id = scanner.nextLine().toLowerCase();
        } while (id.length() > 50);
        System.out.println(id + "??!");
    }
}

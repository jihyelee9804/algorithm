package algorithm.io;

import java.util.Scanner;

public class BOJ10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            scanner.next();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}

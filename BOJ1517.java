package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1517 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {  // i는 인덱스 0부터 비교 반복횟수
            for (int j = 0; j < arr.length - i; j++) { // j는 실제 데이터를 가리키는 값
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
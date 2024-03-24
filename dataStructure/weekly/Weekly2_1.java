package algorithm.dataStructure.weekly;

import java.util.Arrays;

public class Weekly2_1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 1 != numbers[i + 1]) {
                return numbers[i] + 1;
            }
        }
        return -1;
    }
}

class Test1 {
    public static void main(String[] args) {
        System.out.println(new Weekly2_1().solution(new int[]{9, 4, 2, 3, 7, 5}));
    }
}
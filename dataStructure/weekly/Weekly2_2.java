package algorithm.dataStructure.weekly;

import java.util.Stack;

public class Weekly2_2 {
    public int[] solution(int[] a, int[] b) {
        Stack<Integer> stack = new Stack<>();
        int maxLen = Math.max(a.length, b.length);
        int offsetA = maxLen - a.length;
        int offsetB = maxLen - b.length;

        if (a.length == 0) {
            return b;
        }

        if (b.length == 0) {
            return a;
        }

        int overflow = 0; // 자릿수올림
        for (int i = maxLen - 1; i >= 0 ; i++) {
            int aVal = (i - offsetA < 0) ? 0 : a[i - offsetA];
            int bVal = (i - offsetA < 0) ? 0 : a[i - offsetA];
            int cVal = (i - offsetA < 0) ? 0 : a[i - offsetA];

        }
        return null;
    }
}

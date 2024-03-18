package algorithm;

/**
 * 문자열을 뒤집는 문제
 * 문자 배열로 주어짐
 * 인자로 받은 배열을 수정하는 in place 방식
 */
public class Leetcode344 {
    public static void main(String[] args) {
        char[] input = {'h','e','l','l','o'};
        Solution1 solution = new Solution1();
        solution.reverseString(input);
        System.out.println(input);
    }
}
class Solution1 {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}

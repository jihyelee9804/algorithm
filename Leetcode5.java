package algorithm;

public class Leetcode5 {
    public static void main(String[] args) {
        String s = "babad";
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.longestPalindrome(s));
    }

}

class Solution3 {
    // 왼쪽 포인터 인덱스, 회문 최대길이를 저장할 변수
    int left, maxLen;

    /**
     * 회문 확장 메소드
     * @param s : 회문 판별 대상 문자열
     * @param j : begin index
     * @param k : end index
     */
    public void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        // 회문이 기존 최대 길이보다 큰 경우
        if (maxLen < k - j - 1) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }
    public String longestPalindrome(String s) {
        int len = s.length();

        // 문자열 길이가 2 미만인 경우 예외 처리
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i + 1);
            extendPalindrome(s, i, i + 2);
        }

        return s.substring(left, left + maxLen);
    }
}
package algorithm;

/**
 * 회문 판별하는 문제
 * 영문자거나 숫자만 유효한 문자, 대소문자 구분 안 함
 * 공백, 콤마, 콜론은 유효하지 않다고 가정
 */
public class Leetcode125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(s));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        // 정규표현식 사용해서 유효하지 않은 문자 제거
        // replaceAll(): 대상 문자열, 교체할 문자열을 인자로 준다.
        String s_filtered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // 뒤집은 문자열
        String s_reversed = new StringBuilder(s_filtered).reverse().toString();
        return s_filtered.equals(s_reversed);

        /**
        int start = 0;
        int end = s.length() - 1;
        // start와 end가 만나는 지점에서 종료
        while (start < end) {
            // 영문자거나 숫자가 아니면 인덱스 이동
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                // 유효한 문자면서 같지 않으면 회문이 아니므로 종료
                return false;
            }
            // 해당 인덱스에서 회문이면 인덱스 각각 이동
            start++;
            end--;
        }
        // 유효한 문자가 모두 회문조건에 만족하면 true 반환
        return true;
         **/
    }
}

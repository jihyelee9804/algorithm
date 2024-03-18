package algorithm;

import java.util.*;

public class Leetcode49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.groupAnagrams(strs));
    }
}

class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 애너그램 분류를 저장하는 map 생성
        // key: 애너그램 대표 문자열, String 타입
        // value: 애너그램에 해당하는 문자열, List 타입
        Map<String, List<String>> results = new HashMap<>();

        // 입력받은 문자열 배열을 순회
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            // map에 넣을 키
            String key = String.valueOf(chars);

            if (!results.containsKey(key))
                results.put(key, new ArrayList<>());
            // map에 존재하는 key라면 문자열을 value에 추가
            results.get(key).add(s);
        }
        // 애너그램 분류 결과를 arrayList 형식으로 반환
        return new ArrayList<>(results.values());
    }
}

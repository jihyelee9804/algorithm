package algorithm;

public class Programmers86491 {
    class Solution {
        public static int solution(int[][] sizes) {
            int answer = Integer.MAX_VALUE;;
            for (int i = 0; i < sizes.length; i++) {
                for (int j = 0; j < sizes.length; j++) {
                    int size = sizes[i][0] * sizes[j][1];
                    if(size < answer) {
                        answer = size;
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(Solution.solution(sizes));
    }
}

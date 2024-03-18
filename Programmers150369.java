package algorithm;

public class Programmers150369 {
    public static void main(String[] args) {

    }
}

class Solution6 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = -1;
        int distance = 0;
        int temp = 0;
        for (int i = deliveries.length - 1; i >= 0; i++) {
            temp += deliveries[i];
            if (temp > cap) {
                break;
            }
        }


        return answer;
    }
}

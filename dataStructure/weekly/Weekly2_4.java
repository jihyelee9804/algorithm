package algorithm.dataStructure.weekly;

class Weekly2_4 {
    public int solution(int delay, int capacity, int[] times) {
        int currentTime = 0;
        int currentQueue = 0;
        int result = 0;
        for (int time: times) {
            currentTime += time;
            int sent = currentTime / delay;
            currentQueue = Math.max(0, currentQueue - sent);
            if (currentQueue == capacity) {
                result++;
            } else {
                currentQueue++;
            }
            currentTime %= delay;
        }
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        int delay = 5;
        int capacity = 5;
        int[] times = {3, 2, 0, 0, 2, 3, 0, 0, 2, 2, 5};
        System.out.println(new Weekly2_4().solution(delay, capacity, times));
    }
}
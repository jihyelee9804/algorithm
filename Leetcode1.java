package algorithm;

import java.util.Arrays;

public class Leetcode1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution4 solution = new Solution4();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}

class Solution4 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1 ; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};

                }
            }
        }
        return null;
    }
}

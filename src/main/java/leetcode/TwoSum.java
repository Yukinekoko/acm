package leetcode;

import java.util.HashMap;

/**
 * <a href="https://leetcode.cn/problems/two-sum/description">problem</a>
 * @author snowmeow
 */
public class TwoSum {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int v = nums[i] + nums[j];
                if (v == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // hash做法
    public int[] twoSum_1(int[] nums, int target) {
        //
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

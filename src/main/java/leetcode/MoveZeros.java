package leetcode;

/**
 * <a href="https://leetcode.cn/problems/move-zeroes">problem</a>
 * @author snowmeow
 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int cur = 0; // 当前下标位
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[cur] = nums[i];
                if (cur != i) {
                    nums[i] = 0;
                }
                cur++;
            }
        }
    }
}

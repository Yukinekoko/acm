package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * TODO 你可以设计实现一个时间复杂度为 O(m + n) 的算法解决此问题吗？
 * <a href="https://leetcode.cn/problems/merge-sorted-array">problem</a>
 * @author snowmeow
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}

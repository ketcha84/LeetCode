package easy.problem_350;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
//        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int count = 0;
        for (int i : nums1) {
            arr[i]++;
        }
        for (int i : nums2) {
            if (arr[i] > 0) {
                nums1[count++] = i;
                arr[i]--;
            }
        }
        return Arrays.copyOfRange(nums1, 0, count);
    }
}

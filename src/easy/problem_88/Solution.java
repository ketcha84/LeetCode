package easy.problem_88;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        if (n == 0) {
            return;
        }
        int left = 0;
        int right = 0;
        int[] arr = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            if (left < m && right < n) {
                if (nums1[left] <= nums2[right]) {
                    arr[i] = nums1[left++];
                } else {
                    arr[i] = nums2[right++];
                }
            } else if (right >= n) {
                arr[i] = nums1[left++];
            } else if (left >= m) {
                arr[i] = nums2[right++];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
        }
    }
}

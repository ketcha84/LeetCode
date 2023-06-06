package easy.problem_349;

import java.util.Arrays;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] res;
        if (nums1.length > nums2.length) {
            Arrays.sort(nums1);
            res = findIntersection(nums1, nums2);
        } else {
            Arrays.sort(nums2);
            res = findIntersection(nums2, nums1);
        }
        return res;
    }

    private int[] findIntersection(int[] big, int[] small) {
        int[] hash = new int[1001];
        int count = 0;
        for (int n : small) {
            if (bSearch(big, n)) {
                if (hash[n] == 0) {
                    hash[n]++;
                    count++;
                }
            }
        }
        int[] res = new int[count];
        int i = 0;

        for (int j = 0; j < hash.length; j++) {
            if (hash[j] != 0) {
                res[i++] = j;
            }
        }

        return res;
    }

    private boolean bSearch(int[] arr, int num) {
        int l = -1, r = arr.length;
        int m;
        while (r - l > 1) {
            m = (l + r) / 2;
            if (arr[m] == num) return true;
            if (num > arr[m]) {
                l = m;
            } else {
                r = m;
            }
        }
        return false;
    }
}

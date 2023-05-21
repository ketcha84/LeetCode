package medium.problem_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> ls = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int k = nums.length - 1;
        int n = k;
        int[] copy = Arrays.copyOf(nums, nums.length);
        ls.add(getList(nums));
        while (k > 0) {
            leftShift(nums, k);
            if (nums[k] != copy[k]) {
                ls.add(getList(nums));
                k = n;
            } else {
                k = k - 1;
            }
        }

        return ls;
    }

    private List<Integer> getList(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int j : arr) {
            ls.add(j);
        }
        return ls;
    }

    private void leftShift(int[] arr, int k) {
        int tmp = arr[0];
        for (int i = 0; i < k; i++) {
            arr[i] = arr[i + 1];
        }
        arr[k] = tmp;
    }
}

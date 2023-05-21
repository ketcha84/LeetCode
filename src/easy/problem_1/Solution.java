package easy.problem_1;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (right - left >= 1) {
            if (arr[left] + arr[right] > target) {
                right--;
            }
            if (arr[left] + arr[right] < target) {
                left++;
            }

            if (arr[left] + arr[right] == target) {
                return searchindexes(arr[left], arr[right], nums);

            }
        }


        return new int[]{0, 0};
    }

    private static int[] searchindexes(int i, int i1, int[] nums) {
        int[] result = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == i) {
                result[0] = j;
                break;
            }
        }
        for (int j = nums.length - 1; j > 0; j--) {
            if (nums[j] == i1) {
                result[1] = j;
                break;
            }
        }
        return result;
    }
}

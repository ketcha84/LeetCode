package medium.problem_287;

public class Solution {
    public int findDuplicate(int[] nums) {
//        int[] hash = new int[100_001];
//        for (int n : nums) {
//            hash[n]++;
//        }
//        for (int i = 0; i < hash.length; i++) {
//            if (hash[i] > 1) return i;
//        }
//        return 0;

        boolean[] vis = new boolean[nums.length];
        for (int n : nums) {
            if (vis[n]) {
                return n;
            }
            vis[n] = true;
        }
        return -1;
    }
}

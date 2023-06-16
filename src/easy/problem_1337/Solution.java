package easy.problem_1337;

import java.util.PriorityQueue;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        int[] kResult = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int c = getCountRow(mat[i]);
            priorityQueue.offer(new int[]{c, i});
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        while (k > 0) {
            kResult[--k] = priorityQueue.poll()[1];
        }

        return kResult;
    }

    private int getCountRow(int[] row) {
        int left = 0;
        int right = row.length - 1;
        int mid;

        while ((right - left) >= 0) {
            mid = (left + right) / 2;

            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

package easy.hard.problem_4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int currIndex = 0;
        int arr1Curr = 0;
        int arr2Curr = 0;

        while (true) {
            if (arr1Curr < nums1.length && arr2Curr < nums2.length) {
                if (nums1[arr1Curr] <= nums2[arr2Curr]) {
                    arr[currIndex] = nums1[arr1Curr];
                    currIndex++;
                    arr1Curr++;
                } else {
                    arr[currIndex] = nums2[arr2Curr];
                    currIndex++;
                    arr2Curr++;
                }
            } else if (arr1Curr < nums1.length) {
                arr[currIndex] = nums1[arr1Curr];
                currIndex++;
                arr1Curr++;
            }else if (arr2Curr< nums2.length){
                arr[currIndex] = nums2[arr2Curr];
                currIndex++;
                arr2Curr++;
            }else {
                break;
            }
        }

        if (arr.length % 2 == 0) {
            return (arr[(arr.length-1) / 2] + arr[(arr.length-1) / 2 + 1]) / 2.0;
        } else {
            return (arr[(arr.length-1) / 2 ] * 1d);
        }
    }
}

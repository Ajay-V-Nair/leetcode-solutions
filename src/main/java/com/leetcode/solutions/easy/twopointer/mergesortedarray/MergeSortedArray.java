package com.leetcode.solutions.easy.twopointer.mergesortedarray;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1 and nums2
        int i = m - 1;  // Last element index in nums1's actual data
        int j = n - 1;  // Last element index in nums2
        int k = m + n - 1;  // Last position of nums1 (where merged elements will be placed)

        // Merge from the back to avoid overwriting elements in nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]

        int[] nums3 = {1, 5, 3};
        int m2 = 3;
        int[] nums4 = {};
        int n2 = 0;

        merge(nums3, m2, nums4, n2);
        System.out.println(Arrays.toString(nums3)); // Output: [1, 5, 3]

        int[] nums5 = {0};
        int m3 = 0;
        int[] nums6 = {1};
        int n3 = 1;

        merge(nums5, m3, nums6, n3);
        System.out.println(Arrays.toString(nums5)); // Output: [1]
    }


}

# Merge Sorted Array - Optimized Java Solution

## Problem Statement
You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

Merge `nums1` and `nums2` into a single array sorted in non-decreasing order. The final sorted array should not be returned by the function but instead stored inside `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

Problem Link: https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

## Solution Approach
This solution uses the **Two-Pointer Technique** to merge the arrays efficiently in **O(m + n) time complexity** and **O(1) space complexity**.

### Algorithm:
1. Initialize three pointers:
    - `i = m - 1`: Last valid element in `nums1`.
    - `j = n - 1`: Last element in `nums2`.
    - `k = m + n - 1`: Last position in `nums1`.
2. Compare elements from the end and place the larger one at position `k`.
3. Move respective pointers and repeat until one array is exhausted.
4. Copy any remaining elements from `nums2` to `nums1`.

## Complexity Analysis
- **Time Complexity:** O(m + n) → We are iterating through both arrays at most once.
  The while loops process each element exactly once.
  Since we process m + n elements in total, the time complexity is O(m + n).
- **Space Complexity:** O(1) → No extra space used, modifying `nums1` in place.

## Why This Solution is Efficient
- Uses **two pointers** to avoid unnecessary operations.
- Merges **in-place** without extra space.
- Outperforms sorting-based approaches which take O((m+n) log(m+n)).

## Running the Code
To run the solution:
1. Clone this repository.
2. Open the project in an IDE supporting Java.
3. Compile and run the `MergeSortedArray` class.
4. Check the output for correct merging of arrays.
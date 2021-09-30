package ru.main.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/merge-sorted-array/
public class Task88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = IntStream.concat(Arrays.stream(nums1).limit(m), Arrays.stream(nums2))
                .sorted()
                .toArray();
        System.arraycopy(result, 0, nums1, 0, m + n);
    }
}

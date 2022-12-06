package org.devrisby.week1;

// Week 1: Sequences
// URL: https://leetcode.com/problems/two-sum/
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//   - Only one valid answer exists.

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

/**
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */

import java.util.Arrays;

/**
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] out1 = {0,1};
        int[] result1 = twoSum(nums1, target1);

        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] out2 = {1,2};
        int[] result2 = twoSum(nums2, target2);

        int[] nums3 = {3,3};
        int target3 = 6;
        int[] out3 = {0,1};
        int[] result3 = twoSum(nums3, target3);

        System.out.println("Case 1: " + result1);
        System.out.println("Case 1 output: " + Arrays.equals(out1, result1));

        System.out.println("Case 1: " + result2);
        System.out.println("Case 1 output: " + Arrays.equals(out2, result2));

        System.out.println("Case 1: " + result3);
        System.out.println("Case 1 output: " + Arrays.equals(out3, result3));
    }

    public static int[] twoSum(int[] nums, int target) {
        return null;
    }
}

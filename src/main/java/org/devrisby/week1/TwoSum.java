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
        int[] input1 = {2,7,11,15};
        int target1 = 9;
        int[] out1 = {0,1};
        int[] result1 = twoSum(input1, target1);

        int[] input2 = {3,2,4};
        int target2 = 6;
        int[] out2 = {1,2};
        int[] result2 = twoSum(input2, target2);

        int[] input3 = {3,3};
        int target3 = 6;
        int[] out3 = {0,1};
        int[] result3 = twoSum(input3, target3);

        int[] input4 = {-3,4,3,90};
        int target4 = 0;
        int[] out4 = {0,2};
        int[] result4 = twoSum(input4, target4);

        int[] input5 = {3,2,4,10,8,6,7,90};
        int target5 = 92;
        int[] out5 = {1,7};
        int[] result5 = twoSum(input5, target5);

        System.out.println("Case 1: " + Arrays.toString(input1));
        System.out.println("Case 1 output: " + Arrays.toString(result1));
        System.out.println("Case 1 solution is correct: " + Arrays.equals(out1, result1));
        System.out.println();

        System.out.println("Case 2: " + Arrays.toString(input2));
        System.out.println("Case 2 output: " + Arrays.toString(result2));
        System.out.println("Case 2 solution is correct: " + Arrays.equals(out2, result2));
        System.out.println();

        System.out.println("Case 3: " + Arrays.toString(input3));
        System.out.println("Case 3 output: " + Arrays.toString(result3));
        System.out.println("Case 3 solution is correct: " + Arrays.equals(out3, result3));
        System.out.println();

        System.out.println("Case 4: " + Arrays.toString(input4));
        System.out.println("Case 4 output: " + Arrays.toString(result4));
        System.out.println("Case 4 solution is correct: " + Arrays.equals(out4, result4));
        System.out.println();

        System.out.println("Case 5: " + Arrays.toString(input5));
        System.out.println("Case 5 output: " + Arrays.toString(result5));
        System.out.println("Case 5 solution is correct: " + Arrays.equals(out5, result5));
        System.out.println();
    }

    // Two pointer approach
    // This is where you have iterated through a sequence with
    // one "pointer" in the beginning and one "pointer" at the end of the sequence
    //   - Runtime is O(n)

    public static int[] twoSum(int[] nums, int target) {

        if(nums.length == 2){
            return new int[]{0,1};
        }

        int beg = 0;
        int end = nums.length - 1;
        int mid = nums.length/ 2;

        while(beg < mid) {

            // check ends of subarray
            if(nums[beg] + nums[end] == target) {
                return new int[]{beg, end};
            }

            for(int i = 1; i<=mid; i++){

                // check subarrayStart, subarrayStart+i
                if(nums[beg] + nums[beg + i] == target){
                    return new int[]{beg, beg + i};
                }

                // check subarrayEnd, subarrayEnd-i
                else if(nums[end] + nums[end - i] == target){
                    return new int[]{end-i, end};
                }

                // check subarrayStart, subarrayEnd-i
                else if (nums[beg] + nums[end-i] == target) {
                    return new int[]{beg, end-i};
                }

                // check subarrayEnd, subarrayStart+i
                else if (nums[end] + nums[beg+i] == target) {
                    return new int[]{beg+i, end};
                }
            }

            beg++;
            end--;
        }

        return null;
    }
}

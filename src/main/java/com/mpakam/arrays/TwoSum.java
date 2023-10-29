package com.mpakam.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/description/?envType=list&envId=xi4ci4ig
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for(int left=0; left<nums.length;left++)
            for(int right=left+1;right<nums.length;right++){
                if(nums[left] + nums[right] == target){
                    return new int[]{left, right};
                }
            }
        return new int[]{-1, -1};
    }

    public static int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{i,map.get(rem)};
            }else
                map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target =9;
        System.out.println("Returned Array: " + Arrays.toString(twoSum(nums, target)));
        System.out.println("Returned Array: " + Arrays.toString(twoSumV2(nums, target)));
    }
}

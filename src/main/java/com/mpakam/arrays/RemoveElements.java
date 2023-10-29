package com.mpakam.arrays;


/*
https://leetcode.com/problems/remove-element/

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class RemoveElements {

    /*
    Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    public static int removeElement(int[] nums, int val) {
        int left =0;
        for(int right =0;right<nums.length;right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }


    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int k = 3;
        System.out.println("Array Length : " + removeElement(nums, k));
    }

}

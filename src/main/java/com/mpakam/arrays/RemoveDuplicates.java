package com.mpakam.arrays;

/*
    Remove Duplicates from Sorted Array
    https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
    /*
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
     */
        int left = 0;
        for(int right =1; right<nums.length;right++){
            if(nums[left] != nums[right]){
                nums[++left]=nums[right];
            }
        }
        return left+1;
    }

    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Array Length : " + removeDuplicates(nums));
    }

}

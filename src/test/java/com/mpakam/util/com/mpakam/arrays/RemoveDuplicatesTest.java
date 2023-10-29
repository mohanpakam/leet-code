package com.mpakam.util.com.mpakam.arrays;

import com.mpakam.arrays.RemoveDuplicates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.printf("Duplicates were cleaned up and empty from %s", RemoveDuplicates.removeDuplicates(nums));
    }

    @Test
    public void testRemoveDuplicatesWithDataSet2(){
        int[] nums = {1,1,2};
        System.out.printf("Duplicates were cleaned up and empty from %s", RemoveDuplicates.removeDuplicates(nums));
        System.out.println(nums);
        for(int i=0;i<nums.length;i++)
            System.out.println(nums[i]);
    }

}

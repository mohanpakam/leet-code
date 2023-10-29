package com.mpakam.util.com.mpakam.arrays;

import com.mpakam.arrays.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoSumTest {

    @Test
    void testTwoSumAllVersionsTC1(){
        int [] nums = {2,7,11,15};
        int target =9;
        validate(TwoSum.twoSum(nums, target), 0, 1);
        validate(TwoSum.twoSumV2(nums, target), 0, 1);
    }
    @Test
    void testTwoSumAllVersionsTC2(){
        int [] nums = {3,2,4};
        int target =6;
        validate(TwoSum.twoSum(nums, target), 1, 2);
        validate(TwoSum.twoSumV2(nums, target), 1, 2);
    }
    @Test
    void testTwoSumAllVersionsTC3(){
        int [] nums = {3,3};
        int target =6;
        validate(TwoSum.twoSum(nums, target), 0, 1);
        validate(TwoSum.twoSumV2(nums, target), 0, 1);
    }

    private void validate(int[] retNums, int value1, int value2){
        assertEquals(2, retNums.length);
        assertTrue(Arrays.stream(retNums).anyMatch(e->e == value1));
        assertTrue(Arrays.stream(retNums).anyMatch(e->e == value2));
    }
}

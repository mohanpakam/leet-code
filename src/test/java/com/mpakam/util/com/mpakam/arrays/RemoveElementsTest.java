package com.mpakam.util.com.mpakam.arrays;

import com.mpakam.arrays.RemoveElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementsTest {

    @Test
    public void removeElementsTC1(){
        int[] nums = {3,2,2,3};
        int k = 3;
        assertEquals(2, RemoveElements.removeElement(nums, k));
    }

    @Test
    public void removeElementsTC2(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int k = 2;
        assertEquals(5, RemoveElements.removeElement(nums, k));
    }

}

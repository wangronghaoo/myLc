package com.wrh.simple;

import java.util.Arrays;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/26
 */
public class PlusOne {
    /**
     * 给定一个整数数组,然后将其加一 并返回该数组
     * [1,2,4] out:[1,2,5]
     * 如果有9则进一
     */
    public static void main(String[] args) {
        int[] nums = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    private static int[] plusOne(int[] nums){
        int len = nums.length - 1;
        for(int i = len; i >= 0; i--){
            if (nums[i] == 9){
                nums[i] = 0;
            }else {
                nums[i] += 1;
                return nums;
            }
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }
}

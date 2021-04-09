package com.wrh.simple;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/9
 */
public class removeDuplicate {
    /**
     * 删除有序数组中的重复项
     * [1,2,2] [1,2]
     */

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4,5,6,7};
        System.out.println(removeDuplicatea(nums));
    }

    private static int removeDuplicatea(int[] nums){
        if (nums.length == 0) return 0;
        //采用双指针
        //第一个指针指向第一个
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]){
                nums[++i] = nums[j];   //++i 1 i++ 0
            }
        }
        return i + 1;
    }
}

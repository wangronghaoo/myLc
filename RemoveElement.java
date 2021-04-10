package com.wrh.simple;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/9
 */
public class RemoveElement {
    /**
     * 删除数组中的元素
     * 给定一个数组和目标值
     */

    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4};
        int target = 3;
        System.out.println(removeElement(nums,target));

    }
    private static int removeElement(int[] nums,int target){
        if (nums.length == 0) return 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target){
                nums[res++] = nums[i];
            }
        }
        return res;
    }
}

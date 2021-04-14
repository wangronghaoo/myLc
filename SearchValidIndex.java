package com.wrh.simple;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/14
 */
public class SearchValidIndex {

    /**
     * 给定一个有序数组和一个目标值,找到该目标值插入的正确位置
     * [1,5,7] target:2    return  1
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 9};
        int target = 1;
        System.out.println(searchValidIndex(nums, target));
        System.out.println(searchValidIndex2(nums, target));
    }

    /**
     * 迭代
     *
     * @param nums
     * @param target
     * @return
     */
    private static int searchValidIndex(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int index = 0;
        //从右到左遍历
        int n = nums.length - 1;
        for (int i = n; i >= 0; i--) {
            if (nums[i] < target) {
                index = i + 1;
                break;
            }
            if (nums[i] >= target) {
                index = i;
            }
        }
        return index;
    }

    /**
     * 二分法
     */
    private static int searchValidIndex2(int[] nums, int target) {
        int left = 0;
        //获取右边的范围
        int right = nums.length - 1;
        while (left <= right){
            //中间值
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                right = mid - 1;
            }
            if (nums[mid] < target){
                left = mid + 1;
            }
        }
        return left;
    }
}

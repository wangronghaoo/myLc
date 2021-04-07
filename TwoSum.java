package com.wrh.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/5
 */
public class TwoSum {
    /**
     * 给定一个数组,目标值,返回数组中之和等于目标值的索引
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(mapSum(nums, 9)));
    }

    /**
     * 暴力破解
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    /**
     * 获取目标值与各值的差值,在map中寻找,有则返回该key的value,无则将值作为key,索引为value存入
     * @param nums
     * @param target
     * @return
     */
    private static int[] mapSum(int[] nums, int target) {
        if (nums.length < 2) return new int[]{-1, -1};
        Map<Integer, Integer> resMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (resMap.containsKey(target - nums[i])) {
                return new int[]{resMap.get(target - nums[i]), i};
            } else {
                resMap.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}

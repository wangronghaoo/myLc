package com.wrh.simple;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/9
 */
public class AchieveStr {
    /**
     * 给定一个haystack字符串和needke字符串
     * 在haystack中找出needle字符串出现的第一个位置
     * 从0开始,不存在返回-1
     */

    public static void main(String[] args) {
        String haystack = "abcd";
        String needle = "e";
        System.out.println(strStr(haystack,needle));
    }

    private static int strStr(String haystack, String needle) {
        if (haystack.length() == 0) return -1;
        /**
         * 滑动窗口
         * 获取needle长度,在haystack中截取同样的长度
         */
        int i = needle.length();
        int res = -1;
        //haystack - needle 要截取所以防止索引越界
        for (int j = 0; j < haystack.length() - i; j++) {
            //截取的字符串刚好等于needle 返回j
            if (haystack.substring(j, j + i).equals(needle)){
                res = j;
            }
        }
        return res;
    }
}

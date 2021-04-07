package com.wrh.simple;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/6
 */
public class LongestCommonPrefix {
    /**
     * 最长公共前缀
     * 如'abc' 'abcd' 'ab' 最长公共前缀为ab
     */

    public static void main(String[] args) {
        String[] strs = {"abc","acd","abc"};
        System.out.println(longestCommonPrefix(strs));
    }
    private static String longestCommonPrefix(String[] strs){
        if (strs.length == 0) return "";
        String temp = strs[0];  //每一个都与第一个匹配
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(temp)){
                //每次截取掉一个,再进行匹配
                temp = temp.substring(0,temp.length()-1);
                i--;
            }
        }
        return temp;
    }
}

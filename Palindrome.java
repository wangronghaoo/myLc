package com.wrh.simple;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/5
 */
public class Palindrome {
    /**
     * 给定一个int值  判断该值是否为回文数
     * 回文数即从左至右,从右至左都是一样的数 ex:121,12321,54345
     */

    public static void main(String[] args) {
        System.out.println(palindrome(3210));
        System.out.println(palindrome2(3223));
    }

    /**
     * 暴利解法:转为String
     */
    private static Boolean palindrome(int num){
        if (num < 0) return false;
        String temp = String.valueOf(num);
        return temp.equals(new StringBuilder(temp).reverse().toString());
    }

    /**
     * 进行取模,与原数进行比较
     */
    private static Boolean palindrome2(int num){
        if (num < 0) return false;
        int temp = num;
        int reverse = 0;
        while (num != 0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return temp == reverse;
    }
}

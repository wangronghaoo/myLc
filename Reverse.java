package com.wrh.simple;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/5
 */
public class Reverse {

    /**
     * 给定一个int值 如123 返回321,-123 返回-321 120 返回21 0 返回0
     */
    public static void main(String[] args) {
        System.out.println(reverse(746384741));
    }

    /**
     * 整数反转 获取最后一位即可 进行取模,然后每次除10
     * @param num
     * @return
     */
    private static int reverse(int num){
        int res = 0;
        while (num != 0){
            res = res * 10 + num % 10;
            num /= 10;
        }
        //判断是否溢出
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : res;
    }
}

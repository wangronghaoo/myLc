package com.wrh.simple;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/14
 */
public class LastWordLength {
    /**
     * 给定一个字符串,返回最后一个单词的长度
     * "Hello World" return 5
     */

    public static void main(String[] args) {
        String str = "Hello World WangRongHao ";
        System.out.println(lastWordLength(str));
        System.out.println(lastWordLength2(str));

    }

    /**
     * 调用API
     * @param str
     * @return
     */
    private static int lastWordLength(String str){
        if (str.length() == 0) return 0;
        String[] split = str.split(" ");
        return split[split.length - 1].length();
    }

    /**
     * 从右到左开始遍历,遇到空格则结束
     */
    private static int lastWordLength2(String str){
        if (str.length() == 0) return 0;
        int count = 0;
        int sl = str.length() - 1;
        //如果最后一个是空格,则过滤 length - 1
        if (str.charAt(sl) == ' '){
            sl--;
        }
        for (int i = sl; i > 0; i--) {
            if (str.charAt(i) != ' '){
                count++;
            }else {
                break;  //空格直接结束
            }
        }
        return count;
    }

}

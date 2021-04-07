package com.wrh.simple;

import java.util.Stack;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/7
 */
public class ValidBracket {
    /**
     * 给定一个字符串,只限(){}[] 正常关闭返回true,否则false
     */

    public static void main(String[] args) {
        System.out.println(isValidBracket("([{}(}])"));
    }

    private static Boolean isValidBracket(String strs){
        /**
         * 栈:先进后出
         * pop 弹出栈顶元素
         * top  获取栈顶元素
         * isEmpty 是否为空
         * push 入栈
         */
        //奇数直接返回false
        if (strs.length() % 2 ==1) return false;
        //创建一个栈
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < strs.length(); i++) {
            //如果符合({[,直接将对应括号放入到栈中,如果下一个刚好是对应括号则弹出,否则将不是正确关闭返回false
            if (strs.charAt(i) == '('){
                stack.push(')');
            }else if (strs.charAt(i) == '['){
                stack.push(']');
            }else if (strs.charAt(i) == '{'){
                stack.push('}');
            }else if (stack.isEmpty() || strs.charAt(i) != stack.pop()) { //判断栈是否为空,防止以右括号开头
                return false;
            }
        }
        return stack.isEmpty();   //如果为空则全部正确关闭,否则还有多余的括号
    }
}

package com.wrh.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/6
 */
public class RomanToNumber {

    /**
     * 罗马数字包含I 1,V 5,X 10,L 50,C 100,D 500和M 1000
     * 一般情况下小值在右边,则进行+,在左边则进行-
     * 如:4 IV 9 IX 40 XL 90 XC 400 CD 900 CM
     * 给定一串罗马数字,返回代表该数的整数
     */
    public static void main(String[] args) {
        System.out.println(romanToInt("VIIV"));
    }

    private static int romanToInt(String roman){
        int res = 0;
        char[] romans = roman.toCharArray();
        for (int i = 0; i < romans.length; i++) {
            //防止索引越界,并且当下个值大于当前值进行减操作,否则进行加操作
            if (i + 1 < romans.length && getValue(romans[i]) < getValue(romans[i+1])){
                res -= getValue(romans[i]);
            }else {
                res += getValue(romans[i]);
            }
        }
        return res;
    }

    private static int getValue(char key){
        Map<Character,Integer> paramMap = new HashMap<Character, Integer>();
            paramMap.put('I',1);
            paramMap.put('V',5);
            paramMap.put('X',10);
            paramMap.put('L',50);
            paramMap.put('C',100);
            paramMap.put('D',500);
            paramMap.put('M',1000);
        return paramMap.get(key);
    }
}

package com.wrh.simple;


import java.util.LinkedList;
import java.util.List;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/7
 */
public class MergeTwoNodeList {
    /**
     * 合并俩个有序链表[1,2,4] [2,3,5] 输出[1,2,2,3,4,5]
     * 给定[] [0]  输出[0]
     */

    /**
     * 自定义单向链表
     * 当前值、指示的下一个节点
     */
    public static class ListNode {
        int val;
        ListNode nextVal;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        ListNode l1 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(7);
        ListNode l7 = new ListNode(9);
        l1.nextVal = l3;
        l3.nextVal = l4;
        l4.nextVal = l7;
        ListNode l2 = new ListNode(3);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(8);
        l2.nextVal = l5;
        l5.nextVal = l6;
        ListNode listNode = MergeTwoNodeList(l1, l2);
        list.add(listNode.val); //将一个链表的当前值取到
        while (listNode.nextVal != null){
            listNode = listNode.nextVal;
            list.add(listNode.val);
        }
        System.out.println(list);
    }

    private static ListNode MergeTwoNodeList(ListNode l1 , ListNode l2){
        // l1 2279
        // l2 358
        if (l1 == null) {return l2;}
        if (l2 == null) {return l1;}
        if (l1.val < l2.val){
            ListNode listNode = MergeTwoNodeList(l1.nextVal, l2);
            l1.nextVal = listNode;
            return l1;
        }else {
            ListNode listNode = MergeTwoNodeList(l1, l2.nextVal);
            l2.nextVal = listNode; //l2.nextVal = 9 val = 8
            return l2;
        }
    }

}



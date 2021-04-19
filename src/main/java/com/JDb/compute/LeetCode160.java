package com.JDb.compute;


import java.util.HashSet;

public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<Integer> set = new HashSet<>();

        while (null != headA) {
            set.add(headA.hashCode());
            headA = headA.next;
        }
        while (null != headB) {
            if (set.contains(headB.hashCode())) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }
}

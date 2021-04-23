package com.JDb.compute;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        if (null == head || null == head.next) {
            return null;
        }


        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (null == fast) {
            slow=slow.next;
            head.next=null;
            return slow;
        }

        while (fast.next != null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}

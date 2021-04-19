package com.JDb.compute;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (null != head) {
            sb.append(head.val);
            head = head.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}

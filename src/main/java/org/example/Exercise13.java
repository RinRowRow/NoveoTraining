package org.example;

import org.example.domen.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Exercise13 {
    /*
Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.


Time complexity = O(n)

Space complexity O(1)
    */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        ListNode root = new ListNode();
        ListNode currentNode = root;
        while (l1 != null || l2 != null) {
            currentNode.next = new ListNode();
            currentNode = currentNode.next;
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + remainder;
            remainder = sum / 10;
            currentNode.val = sum % 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (remainder > 0) {
            currentNode.next = new ListNode(remainder);
        }
        return root.next;
    }
}

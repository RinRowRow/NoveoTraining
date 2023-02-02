package org.example;

import org.example.domen.ListNode;

import java.util.Map;
import java.util.TreeMap;

public class Exercise10 {
    /*
Merge k Sorted Lists

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.


Time complexity = O(n^2)

Space complexity O(n)
    */

    public ListNode mergeKLists(ListNode[] lists) {
        TreeMap<Integer, Integer> countByValue = new TreeMap<>();
        for (ListNode listNode : lists) {
            while (listNode != null) {
                countByValue.put(listNode.val, countByValue.getOrDefault(listNode.val, 0) + 1);
                listNode = listNode.next;
            }
        }
        ListNode root = new ListNode();
        ListNode current = null;
        ListNode prev = root;
        for (Map.Entry<Integer, Integer> entry : countByValue.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                current = new ListNode(entry.getKey());
                prev.next = current;
                prev = current;
            }
        }

        return root.next;
    }
}

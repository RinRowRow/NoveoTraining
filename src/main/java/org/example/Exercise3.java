package org.example;

import org.example.domen.TreeNode;

public class Exercise3 {
    /*
Convert Sorted Array to Binary Search Tree

Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
    */

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(0, nums.length - 1, nums);
    }

    private TreeNode sortedArrayToBST(int min, int max, int[] nums) {
        if (min > max) {
            return null;
        }
        int mid = min + (max - min) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(min, mid - 1, nums);
        node.right = sortedArrayToBST(mid + 1, max, nums);

        return node;
    }
}

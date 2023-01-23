package org.example;

import org.example.domen.TreeNode;

public class Exercise5 {
    /*
Range Sum of BST

Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
    */

    public int rangeSumBST(TreeNode root, int low, int high) {
        return rangeSumBST(root, low, high, 0);
    }

    public int rangeSumBST(TreeNode root, int low, int high, int sum) {
        if (root == null) {
            return sum;
        }

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        sum = rangeSumBST(root.left, low, high, sum);
        return rangeSumBST(root.right, low, high, sum);
    }
}

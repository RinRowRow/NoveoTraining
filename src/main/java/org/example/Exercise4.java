package org.example;

import org.example.domen.TreeNode;

public class Exercise4 {
    /*
Floor and Ceil from a BST

Given a binary search tree and a key(node) value, find the floor and ceil value for that particular key value.

Floor Value Node: Node with the greatest data lesser than or equal to the key value.
Ceil Value Node: Node with the smallest data larger than or equal to the key value.
    */

    public int[] findFloorAndCeil(TreeNode root, int key) {
        return findFloorAndCeil(root, key, -1);
    }

    private int[] findFloorAndCeil(TreeNode node, int key, int ceil) {
        if (node == null) {
            return key > ceil ? new int[]{ceil, -1} : new int[] {-1, ceil};
        }

        if (key == node.val) {
            return new int[]{key, key};
        }

        if (key > node.val && node.right == null && key < ceil) {
            return new int[]{node.val, ceil};
        }

        if (key < node.val && node.left == null && key > ceil) {
            return new int[]{ceil, node.val};
        }

        return key > node.val ? findFloorAndCeil(node.right, key, node.val) : findFloorAndCeil(node.left, key, node.val);
    }
}

package org.example;

import org.example.domen.TreeNode;

public class Exercise1 {
    /*
        Given the root of a binary tree, invert the tree, and return its root.
    */
    public TreeNode invertTree(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertTree(node.left);
        invertTree(node.right);

        return node;
    }
}

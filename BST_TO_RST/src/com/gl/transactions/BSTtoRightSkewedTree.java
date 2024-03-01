package com.gl.transactions;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class BSTtoRightSkewedTree {
    static TreeNode prev = null;

    public static TreeNode convertBSTtoRightSkewed(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode dummyNode = new TreeNode(0);
        prev = dummyNode;

        convertBSTtoRightSkewedHelper(root);

        return dummyNode.right;
    }

    public static void convertBSTtoRightSkewedHelper(TreeNode root) {
        if (root == null) {
            return;
        }

        convertBSTtoRightSkewedHelper(root.left);

        TreeNode rightNode = root.right;

        if (prev != null) {
            prev.right = root;
            root.left = null;
            prev = root;
        }

        convertBSTtoRightSkewedHelper(rightNode);
    }

    // Example usage
    public static void main(String[] args) {
        // Construct a sample Binary Search Tree
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(20);
        root.right = new TreeNode(60);
        root.right.left = new TreeNode(55);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);

        // Convert the BST to a Right-Skewed tree
        TreeNode skewedRoot = convertBSTtoRightSkewed(root);

        // Print the Right-Skewed tree for verification
        while (skewedRoot != null) {
            System.out.print(skewedRoot.val + " ");
            skewedRoot = skewedRoot.right;
        }
    }
}
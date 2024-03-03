package com.gl.transactions;

public class Driver {
    Node node;


    public static void main(String[] args) {
        // Construct a Binary Search Tree
        Driver tree = new Driver();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.left.left.right = new Node(20);
        tree.node.right.left = new Node(55);
        tree.node.right.right = new Node(100);

        // Convert the BST to a Right-Skewed tree
        Node skewedRoot = BSTtoRightSkewedTree.convertBSTtoRightSkewed(tree.node);

        // Print the Right-Skewed tree for verification
        while (skewedRoot != null) {
            System.out.print(skewedRoot.val + " ");
            skewedRoot = skewedRoot.right;
        }
    }
}

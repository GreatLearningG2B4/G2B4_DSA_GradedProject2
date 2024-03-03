package com.gl.transactions;

public class BSTtoRightSkewedTree {
    static Node prev = null;


    public static Node convertBSTtoRightSkewed(Node root) {
        if (root == null) {
            return null;
        }

        Node dummyNode = new Node(0);
        prev = dummyNode;

        convertBSTtoRightSkewedHelper(root);
        return dummyNode.right;
    }


    public static void convertBSTtoRightSkewedHelper(Node root) {
        if (root == null) {
            return;
        }
        convertBSTtoRightSkewedHelper(root.left);
        Node rightNode = root.right;

        if (prev != null) {
            prev.right = root;
            root.left = null;
            prev = root;
        }
        convertBSTtoRightSkewedHelper(rightNode);
    }
}

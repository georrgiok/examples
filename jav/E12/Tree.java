package jav.E12;

import jav.Lib_folder.Lib;

public class Tree {

    public Node root;

    public Tree() {
        this.root = null;
    }

    Node rotateLeft(Node node) {
        System.out.printf("rotateLeft\n");
        Node child = node.right;
        Node childLeft = child.left;

        child.left = node;
        node.right = childLeft;

        return child;
    }

    Node rotateRight(Node node) {
        System.out.printf("rotateRight\n");
        Node child = node.left;
        Node childRight = child.right;

        child.right = node;
        node.left = childRight;

        return child;
    }

    boolean isRed(Node node) {
        if (node == null)
            return false;

        return node.isRed();
    }

    void swapColors(Node node1, Node node2) {
        node1.swapColors(node2);
    }

    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            return node;
        }
        ///////////////////////////////////////////////////////////
        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);

            swapColors(node, node.left);
        }

        ////////////////////////////////////////////////////////////
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
            swapColors(node, node.right);
        }

        ///////////////////////////////////////////////////////////
        if (isRed(node.left) && isRed(node.right)) {
            node.changeColor();
            node.left.changeColor(false);
            node.right.changeColor(false);
        }

        return node;
    }

    // Обход по порядку
    void Print(Node node) {
        if (node != null) {
            Print(node.left);
            Lib.Write(" |>" + node.data + " (" + node.colorString() + ")");
            Print(node.right);
        }
    }

    void Print() {
        this.Print(this.root);
    }

}

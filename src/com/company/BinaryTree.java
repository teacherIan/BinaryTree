package com.company;

public class BinaryTree {

    Node root;

    public void add(Node node) {

        root = addRecursion(root,node);

    }

    private Node addRecursion(Node root, Node node) {

        if(root == null) {
            root = node;
            return root;
        }

        if(root.getData() < node.getData()) {
            root.setLeftNode(addRecursion(root.getLeftNode(),node));
        }
        else {
            root.setRightNode(addRecursion(root.getRightNode(),node));
        }

        return root;
    }

    public void view() {

        viewRecursion(root);

    }

    private void viewRecursion(Node root) {

        if(root != null) {
            viewRecursion(root.getLeftNode());
            System.out.println(root.getData());
            viewRecursion(root.getRightNode());
        }
    }

}

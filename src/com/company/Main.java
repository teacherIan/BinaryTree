package com.company;

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.add(new Node(50));
        tree.add(new Node(70));
        tree.add(new Node(20));
        tree.add(new Node(27));
        tree.add(new Node(18));
        tree.add(new Node(94));
        tree.add(new Node(1000));
        tree.add(new Node(2345));
        tree.add(new Node(20));
        tree.add(new Node(20));
        tree.add(new Node(20));
        tree.add(new Node(23456));

        tree.view();

        

    }
}

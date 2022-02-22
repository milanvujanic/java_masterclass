package com.milan;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(33);
        binarySearchTree.insert(22);
        binarySearchTree.insert(10);
        binarySearchTree.insert(28);
        binarySearchTree.insert(1);

        binarySearchTree.traverse();


    }
}

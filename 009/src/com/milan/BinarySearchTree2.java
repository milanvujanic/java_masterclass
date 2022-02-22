package com.milan;

import javax.management.remote.rmi._RMIConnection_Stub;

public class BinarySearchTree2 {

    private ListItem root;

    public void traverse() {
        traverseInOrder(root);
    }

    private void traverseInOrder(ListItem listItem) {
        if (listItem != null) {
            traverseInOrder(listItem.getLeft());
            System.out.println(listItem);
            traverseInOrder(listItem.getRight());
        }
    }

    public void add(Object data) {
        if (root == null) {
            root = new ListItemImpl(data);
        } else {
            add(data, root);
        }
    }

    private void add(Object data, ListItem listItem) {
        ListItemImpl listItem1= new ListItemImpl(data);
        if (listItem1.compareTo(listItem) < 0) {
            if (listItem.getLeft() == null) {
                listItem.setLeft(listItem1);
            } else {
                add(data, listItem.getLeft());
            }
        } else if (listItem1.compareTo(listItem) > 0) {
            if (listItem.getRight() == null) {
                listItem.setRight(listItem1);
            } else {
                add(data, listItem.getRight());
            }
        }
    }
}

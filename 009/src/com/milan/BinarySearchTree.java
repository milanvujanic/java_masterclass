package com.milan;

public class BinarySearchTree {

    private ListItem root;

    public void insert(Object data) {
        if (root == null) {
            root = new ListItemImpl(data);
        }
        insert(data, root);
    }

    public void traverse() {
        traverseInOrder(root);
    }

    private void traverseInOrder(ListItem node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            System.out.println(node);
            traverseInOrder(node.getRight());
        }
    }

    private void insert(Object data, ListItem listItem) {
        if (new ListItemImpl(data).compareTo(listItem) < 0) {
            if (listItem.getLeft() == null) {
                ListItem newListItem = new ListItemImpl(data);
                listItem.setLeft(newListItem);
            } else {
                insert(data, listItem.getLeft());
            }
        } else if (new ListItemImpl(data).compareTo(listItem) > 0) {
            if (listItem.getRight() == null) {
                ListItem newListItem = new ListItemImpl(data);
                listItem.setRight(newListItem);
            } else {
                insert(data, listItem.getRight());
            }
        }
    }
}

package com.milan;

public class LinkedList {

    private ListItem head;

    public void add(Object value) {
        ListItem listItem = new ListItemImpl(value);
        if (head == null) {
            head = listItem;
        } else {
            ListItem temp = head;
            while (listItem.compareTo(temp) > 0 && temp.getRight() != null) {
                temp = temp.getRight();
            }

            if (listItem.compareTo(temp) < 0) {
                listItem.setRight(temp);
                listItem.setLeft(temp.getLeft());
                if (temp == head) {
                    head = listItem;
                }
                if (temp.getLeft() != null) {
                    temp.getLeft().setRight(listItem);
                }
                temp.setLeft(listItem);
            } else if (listItem.compareTo(temp) > 0) {
                listItem.setLeft(temp);
                temp.setRight(listItem);
            }
        }
    }

    public void remove(Object value) {
        ListItem listItem = new ListItemImpl(value);

        if (head != null) {
            ListItem temp = head;
            while (listItem.compareTo(temp) != 0 && temp.getRight() != null) {
                temp = temp.getRight();
            }
            if (listItem.compareTo(temp) == 0) {
                ListItem previous = temp.getLeft();
                if (previous != null) {
                    previous.setRight(temp.getRight());
                    temp.setRight(null);
                } else {
                    temp.setRight(null);
                }
            }
        }
    }

    public void show() {
        ListItem temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getRight();
        }
    }
}

package com.milan;

import java.util.Locale;

public abstract class ListItem {

    private ListItem left;
    private ListItem right;
    private Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public ListItem getLeft() {
        return left;
    }

    public void setLeft(ListItem left) {
        this.left = left;
    }

    public ListItem getRight() {
        return right;
    }

    public void setRight(ListItem right) {
        this.right = right;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public abstract ListItem next();

    public abstract ListItem previous();

    public int compareTo(ListItem listItem) {
        if (value instanceof Integer) {
            int currentValue = (Integer) this.value;
            int comparingValue = (Integer) (listItem.getValue());
            return currentValue < comparingValue ? -1 : currentValue > comparingValue ? 1 : 0;
        } else if (value instanceof Long) {
            long currentValue = (Long) this.value;
            long comparingValue = (Long) (listItem.getValue());
            return currentValue < comparingValue ? -1 : currentValue > comparingValue ? 1 : 0;
        } else if (value instanceof Float) {
            float currentValue = (Float) this.value;
            float comparingValue = (Float) (listItem.getValue());
            return currentValue < comparingValue ? -1 : currentValue > comparingValue ? 1 : 0;
        } else if (value instanceof Double) {
            double currentValue = (Double) this.value;
            double comparingValue = (Double) (listItem.getValue());
            return currentValue < comparingValue ? -1 : currentValue > comparingValue ? 1 : 0;
        } else if (value instanceof String) {
            String currentValue = (String) this.value;
            String comparingValue = (String) (listItem.getValue());
            return currentValue.toLowerCase(Locale.ROOT).compareTo(comparingValue.toLowerCase(Locale.ROOT));
        }
        return -10;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "value=" + value +
                '}';
    }
}

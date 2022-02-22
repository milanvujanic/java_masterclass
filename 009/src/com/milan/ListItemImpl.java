package com.milan;

public class ListItemImpl extends ListItem {

    public ListItemImpl(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.getRight();
    }

    @Override
    public ListItem previous() {
        return this.getLeft();
    }
}

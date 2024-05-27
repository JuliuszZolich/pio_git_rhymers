package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;

    private static final int EMPTY_SIZE = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_SIZE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_SIZE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}

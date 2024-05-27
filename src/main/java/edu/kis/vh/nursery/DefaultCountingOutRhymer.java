package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int CAPACITY = MAX_SIZE - 1;
    public static final int[] STORAGE = new int[CAPACITY];
    public static final int EMPTY_VALUE = -1;
    public int total = EMPTY_VALUE;
    static final int DEFAULT_RETURN = -1;

    public void countIn(int in) {
        if (!isFull())
            STORAGE[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return STORAGE[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return STORAGE[total--];
    }

}

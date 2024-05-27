package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_VALUE = -1;
    private static final int DEFAULT_RETURN = -1;

    private final int MAX_SIZE = 12;
    private final int CAPACITY = MAX_SIZE - 1;

    private final int[] storage = new int[CAPACITY];

    private int total = EMPTY_VALUE;


    public void countIn(int in) {
        if (!isFull())
            storage[++total] = in;
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
        return storage[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return storage[total--];
    }

    public int getTotal() {
        return total;
    }
}

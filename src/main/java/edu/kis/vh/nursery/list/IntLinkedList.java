package edu.kis.vh.nursery.list;

/**
 * Klasa IntLinkedList reprezentuje listę jednokierunkową przechowującą liczby całkowite.
 */
public class IntLinkedList {

    // Ostatni element listy
    private Node last;

    // Stała reprezentująca pustą listę
    private static final int EMPTY_SIZE = -1;

    /**
     * Metoda dodająca element do listy.
     * @param i element do dodania.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Metoda sprawdzająca, czy lista jest pusta.
     * @return true, jeśli lista jest pusta, false w przeciwnym razie.
     */
    private boolean isEmpty() {
        return last == null;
    }

    /**
     * Metoda sprawdzająca, czy lista jest pełna.
     * @return zawsze false, ponieważ lista jednokierunkowa nie ma ograniczonej pojemności.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Metoda zwracająca wartość ostatniego elementu listy.
     * @return wartość ostatniego elementu lub EMPTY_SIZE, jeśli lista jest pusta.
     */
    public int top() {
        if (isEmpty())
            return EMPTY_SIZE;
        return last.getValue();
    }

    /**
     * Metoda usuwająca i zwracająca wartość ostatniego elementu listy.
     * @return wartość ostatniego elementu lub EMPTY_SIZE, jeśli lista jest pusta.
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_SIZE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
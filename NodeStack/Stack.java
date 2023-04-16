package stack;

public class Stack implements IStack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public String pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        String value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public String top() throws EmptyStackException{
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    private class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
            this.next = null;
        }
    }
}


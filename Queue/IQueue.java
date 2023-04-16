package datastructures;

public interface IQueue {
	void  equeue(Object element) throws QueueException;
	Object dequeue() throws QueueException;
	Object next() throws QueueException;
	boolean isFull();
	boolean isEmpty();
	String print();
}

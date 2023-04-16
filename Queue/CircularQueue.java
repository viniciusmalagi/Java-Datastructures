package datastructures;

public class CircularQueue implements IQueue{
	private int start, end;
	private Object[] data;
	private int len;

	public CircularQueue() {
		this(10);
	}
	
	public CircularQueue(int len) {
		this.len = 0;
		this.start = -1;
		this.end = -1;
		this.data = new Object[len];
	}
	
	public void equeue(Object element) throws QueueException{
		if (!isFull()) {
			if (this.end == data.length -1) {
				this.end = -1;
			}
			this.len++;
			this.end++;
			data[this.end] = element;
		}
		else {
			throw new QueueException("Unable to equeue");
		}
	}
	
	public Object dequeue() throws QueueException{
		Object element = null;
		if (!isEmpty()) {
			if (this.end == data.length -1) {
				this.end = -1;
			}
			this.len--;
			this.start++;
			element = data[this.start];
		}
		else {
			throw new QueueException("Unable to dequeue");
		}
		return element;
	}
	
	public Object next() throws QueueException{
		Object element = null;
		int aux = this.start;
		if (!isEmpty()) {
			if (aux == data.length -1) {
				aux = -1;
			}
			element = data[aux + 1];
		}
		else {
			throw new QueueException("Unable to next");
		}
		return element;
	}
	
	public boolean isFull() {
		return this.len == data.length;
	}

	public boolean isEmpty() {
		return this.len == 0;
	}
	
	public String print() {
		String result = "[ ";
		int i = this.start + 1;
		for (int auxLen = 0; auxLen != this.len; auxLen++) {
			if (i == data.length)
				i = 0;
			if (i == this.end)
				result += data[i];
			else
				result += data[i] + ", ";
			i++;
		}
		return result + " ]";
	}
}
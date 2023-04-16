package datastructures;

public class StaticQueue implements IQueue{

		private int start, end;
		private Object[] data;
		
		public StaticQueue() {
			this(10);
		}
		
		public StaticQueue(int len) {
			this.start = -1;
			this.end = -1;
			data = new Object[len];
		}
		
		public void equeue(Object element) throws QueueException{
			if(!isFull()) {
				this.end++;
				data[this.end] = element; 
			}
			else {
				throw new QueueException("Unable to equeue");
			}
		}
		
		public Object dequeue() throws QueueException{
			Object element = null;
			if(!isEmpty()) {
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
			if (!isEmpty()) {
				element = data[this.start+1];
			}
			else {
				
				throw new QueueException("Unable to next element");
			}
			return element;
		}
		
		public boolean isFull() {
			return this.end == this.data.length -1;
		}
		
		public boolean isEmpty() {
			return this.start == this.end;
		}
		
		public String print() {
			String result = "[";
			for (int i = this.start+1; i<= this.end; i++) {
				if (i == this.end) {
					result += data[i];
				}
				else {
					result += data[i] + ", ";
				}
			}
			return result + "]";
		}
}


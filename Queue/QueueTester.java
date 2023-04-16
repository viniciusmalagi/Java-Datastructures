package datastructures;

public class QueueTester {
	public static void executeStaticQueue() {
		System.out.println("Starting Static Queue...");
		try {
			
			StaticQueue myqueue = new StaticQueue();
			myqueue.equeue("Blah 1");
			myqueue.equeue("Blah 2");
			System.out.println(myqueue.next());
			System.out.println(myqueue.next());
			myqueue.dequeue();// Blah 1
			myqueue.equeue("Blah 3");
			System.out.println(myqueue.next());
			myqueue.equeue("Blah 4");
			myqueue.equeue("Blah 5");
			myqueue.equeue("Blah 6");
			myqueue.equeue("Blah 7");
			myqueue.equeue("Blah 8");
			myqueue.equeue("Blah 9");
			myqueue.equeue("Blah 10");
			myqueue.dequeue(); // Blah 2
			myqueue.dequeue(); // Blah 3
			myqueue.dequeue(); // Blah 4
			myqueue.dequeue(); // Blah 5
			myqueue.dequeue(); // Blah 6
			System.out.println(myqueue.print());
		}catch (QueueException e) {
			System.err.println(e);
		}
	}
	
	public static void executeCircularQueue() {
		System.out.println("Starting Circular Queue...");
		try {
			IQueue myqueue = new CircularQueue();
			myqueue.equeue("Blah 1");
			myqueue.equeue("Blah 2");
			System.out.println(myqueue.next());
			System.out.println(myqueue.next());
			myqueue.equeue("Blah 3");
			System.out.println(myqueue.next());
			myqueue.equeue("Blah 4");
			myqueue.equeue("Blah 5");
			myqueue.equeue("Blah 6");
			myqueue.equeue("Blah 7");
			myqueue.equeue("Blah 8");
			myqueue.equeue("Blah 9");
			myqueue.equeue("Blah 10");
			myqueue.dequeue(); // Blah 1
			myqueue.equeue("Blah 11");
			myqueue.dequeue(); // Blah 2
			myqueue.equeue("Blah 12");
			System.out.println(myqueue.print());
		}catch (QueueException e) {
			System.err.println(e);
		}
	}
	public static void main(String[] args) {
		executeStaticQueue();
		executeCircularQueue();
	}
}

package stack;

public class EmptyStackException extends Exception{
	public EmptyStackException() {
		super("[ERROR] Stack is empty!!");
	}
}

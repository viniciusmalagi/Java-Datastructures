package stack;

public interface IStack {
	public void push(String value);
	public String pop() throws EmptyStackException;
	public String top() throws EmptyStackException;
	public boolean isEmpty();
	public int size();
}

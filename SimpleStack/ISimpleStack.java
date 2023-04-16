package stackpkg;

public interface ISimpleStack {
	public void push(String texto);
	public String pop() throws StackException;
}

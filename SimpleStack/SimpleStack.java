package stackpkg;

public class SimpleStack implements ISimpleStack{
	private String[] stack = new String[100];
	private int top = -1;

	SimpleStack(){}

	public void push(String texto){
		stack[++top] = texto;
	}
	public String pop() throws StackException {
		String text ="";
		if (top == -1) {
			throw new StackException("THE LIST IS EMPTY!");
		}
		else {
			text = stack[top];
			stack[top--] = null;
		}
		return text;
	}
	
	@Override
	public String toString() {
		String string ="";
		for (String s : stack){
			if (s != null) {
				string += s + "\n";
			}
		}
		return string;
		}
}

package stackpkg;

public class SimpleStackTester {
	
	public static void execute() {
		SimpleStack simpleSstack = new SimpleStack();
		String names[] = {
				"João", "Maria", "Antonio", "UniBrasil",
				"Marcos","Eugênio", "Leão", "Joaquim", "José",
				"Vinicius"
		};
		//INSERTING THE 10 NAMES
		for(String n : names) {
			simpleSstack.push(n);
			System.out.println(n + " - ADDED!");
		}
		//REMOVING THE 10 NAMES
		String str;
		for(int i=0; i <10; i++) {
			try {
				str = simpleSstack.pop();
				System.out.println(str + " - REMOVED!");
			}
			catch(StackException e) {
				System.out.println(e);
			}
		}
		//STACK EMPTY
		try {
			simpleSstack.pop();
		}
		catch(StackException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		execute();
		
	}

}

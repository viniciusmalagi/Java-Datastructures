package stack;

public class StackTester {
    public static void execute() {
    	String[] names = new String[] {
    			"Maria", "Antonio", "Unibrasil", "Marcos",
    			"João", "Karine", "Karina", "Luís",
    			"José", "Vinicius"
    	};
        Stack pilha = new Stack();
        System.out.println("##### PUSH #####");
        for(String str : names) {
        	pilha.push(str);
        	System.out.println(str+= " Added!!");
        }
        System.out.println("##### POP #####");
        String str;
        while (!pilha.isEmpty()) {
        	try {
        		str = pilha.pop();
        		System.out.println(str += " Removed!!");
        	}
        	catch(EmptyStackException e){
        		System.out.println(e);
        	}
        }
    }
    
    public static void main(String[] args) {
    	execute();
    }
}


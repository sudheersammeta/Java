package custexceptions;

public class EmptyStackException extends Exception {
	public EmptyStackException() {
		// TODO Auto-generated constructor stub
		//System.out.println("Stack is Empty");
		super("Stack is Empty");
	}
}

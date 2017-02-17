package java;

import custexceptions.EmptyQueueException;
import custexceptions.EmptyStackException;

public class RunApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<String> stk1 = new MyStack<String>();
		stk1.push("sudheer");
		stk1.push("sammeta");
		
		//Cannot push other data type as we created stack for strings.
		//stk1.push(5);
		
		try {
			System.out.println(stk1.pop());
			System.out.println(stk1.pop());
			System.out.println(stk1.pop());
		} catch (EmptyStackException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		MyQueue<String> q1 = new MyQueue<String>();
		q1.push("foo");
		q1.push("bar");
		q1.push("beyond");
		try {
			System.out.println(q1.pop());
			System.out.println(q1.pop());
			System.out.println(q1.pop());
			//System.out.println(q1.pop());
			q1.push("all");
			q1.push("recognition");
			System.out.println(q1.pop());
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}

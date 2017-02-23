package hackerrank;

import java.util.Scanner;

public class StackSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackSolution ss = new StackSolution();
		Scanner scanner = new Scanner(System.in); 
		String s = scanner.nextLine();
		//String s = "# 34 25 ? -5 - # ?";
		String[] inputs = s.split(" ");
		for(String str:inputs){
						
			switch(str){
				case "#" : System.out.println(ss.depth());
				break;
				case "?" : System.out.println(ss.peek());
				break;
				case "-" : System.out.println(ss.pop());
				break;
				default : System.out.println(ss.push(Integer.parseInt(str)));
			}
		}
	}
	
	Node top;
	int size;
	
	public int push(int element){
		Node oldTop = top;
		this.top = new Node();
		this.top.value = element;
		this.top.next = oldTop;
		size++;
		return size;
	}
	
	public int pop(){
		int i = top.value;
		top = top.next;
		size--;
		return i;
	}
	
	public int peek(){
		return top.value;
	}
	
	public int depth(){
		return this.size;
	}
	
	class Node{
		Node next;
		int value;
	}
}

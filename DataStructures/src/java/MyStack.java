package java;

import custexceptions.*;

public class MyStack<Item> {
	Node<Item> top;
	
	public void push(Item element){
		Node<Item> oldTop = top;
		this.top = new Node<Item>();
		this.top.value = element;
		this.top.next = oldTop;
	}
	
	public Item pop() throws EmptyStackException{
		if(isEmpty()){
			throw new EmptyStackException();
		}
		Item i = top.value;
		top = top.next;
		return i;
	}
	
	public boolean isEmpty(){
		return this.top == null;
	}
}

class Node<Item>{
	Node<Item> next;
	Item value;
}


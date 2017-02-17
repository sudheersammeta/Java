package java;

import custexceptions.*;

public class MyQueue<Item> {
	Node<Item> first;
	Node<Item> last;
	
	public void push(Item element){
		
		//Creating new node and linking in the list.
		Node<Item> current = new Node<Item>();
		current.value = element;
		current.before = this.last;
		current.after = null;
		
		//linking last element of list to new node
		if(last != null)
			last.after = current;
		
		//updating last node to current element
		last = current;
		
		
		if(first == null)
			this.first = current;
	}
	
	public Item pop() throws EmptyQueueException{
		if(isEmpty()){
			throw new EmptyQueueException();
		}
		Item i = first.value;
		first =first.after;
		return i;
	}
	
	public boolean isEmpty(){
		return this.first == null;
	}
	
	class Node<Item>{
		Node<Item> before;
		Node<Item> after;
		Item value;
	}
}




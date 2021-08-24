package com.datastructurell;

public class MyLinkedList {
	private INode head;
	private INode tail;
	
	public MyLinkedList() {
		
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public void insertElement(INode myNode) {
		INode temp = head;
		INode tempLast = temp.getNext();
		temp.setNext(myNode);
		myNode.setNext(tempLast);
		
	}
	
	public void deleteFirst() {
		INode temp = head.getNext();
		head = temp;
	}
	
	public void printList() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode temp = this.head;
		while (temp != null) {
			printformat.append(temp.getKey());
			if ( temp != tail) {
				printformat.append("->");
			}
			temp = temp.getNext();
		}
		System.out.print(printformat);
	}
}

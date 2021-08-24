package com.datastructurell;

public class LinkedListRunner {
	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinked = new MyLinkedList();
		
		myLinked.add(thirdNode);
		myLinked.add(secondNode);
		myLinked.add(firstNode);
		myLinked.printList();
	}
}

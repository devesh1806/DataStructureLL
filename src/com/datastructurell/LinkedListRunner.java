package com.datastructurell;
import java.util.Scanner;

public class LinkedListRunner {
	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinked = new MyLinkedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1.Add 2.Append");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:

				myLinked.add(thirdNode);
				myLinked.add(secondNode);
				myLinked.add(firstNode);
				myLinked.printList();
				break;
				
			case 2:

				myLinked.append(firstNode);
				myLinked.append(secondNode);
				myLinked.append(thirdNode);
				myLinked.printList();
				break;
				
			default:
				System.out.println("Enter valid choice");
				break;
		}
	}
}

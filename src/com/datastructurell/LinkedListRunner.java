package com.datastructurell;
import java.util.Scanner;

public class LinkedListRunner {
	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinked = new MyLinkedList();
		
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		while (true) {
			System.out.println("Enter 1.Add 2.Append 3.Insert Between 4.Delete First 5.Delete Last 6.exit");
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
					
				case 3:
					
					myLinked.append(firstNode);
					myLinked.append(thirdNode);
					myLinked.insertElement(secondNode);
					myLinked.printList();
					break;
							
				case 4:
					
					myLinked.deleteFirst();
					myLinked.printList();
					break;
				
				case 5:
					
					myLinked.deleteLast();
					myLinked.printList();
					break;
				
				case 6:
					flag = 1;
					break;
					
				default:
					System.out.println("Enter valid choice");
					break;
			}
			if (flag ==1 )break;
		}
	}
}

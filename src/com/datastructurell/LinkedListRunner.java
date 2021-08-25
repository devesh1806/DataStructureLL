package com.datastructurell;
import java.util.Scanner;

public class LinkedListRunner {
	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinked = new MyLinkedList();
		SortedLinkedList mySortedLinked = new SortedLinkedList();
		
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		while (true) {
			System.out.println("Enter 1.Add 2.Append 3.Insert Between 4.Delete First "
					+ "5.Delete Last 6.Search 7.Insert Element After 30 8.Delete Element "
					+ "9.Ordered Linked List 10.exit");
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
					
					myLinked.searchElement(30);
					break;
					
				case 7:
					myLinked.insertElementAfter(30,40);
					myLinked.printList();
					break;
					
				case 8:
					System.out.println("Size before deletion is " + myLinked.size());
					myLinked.deleteElement(40);
					myLinked.printList();
					System.out.println("Size after deletion is " + myLinked.size());
					break;
					
				case 9:
					MyNode<Integer> newNode = new MyNode<Integer>(40);
					mySortedLinked.add(firstNode);
					mySortedLinked.add(secondNode);
					mySortedLinked.add(newNode);
					mySortedLinked.add(thirdNode);
					mySortedLinked.printSortedList();
					break;
					
				case 10:
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

package com.datastructurell;

public class SortedLinkedList {
	private INode head;
	
	public SortedLinkedList() {
		this.head = null;
	}
	
	public void add(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		else {
			int flag = 0;
			INode temp = head;
			INode lastTemp = head;
			while( temp != null) {
				if (String.valueOf(temp.getKey()).compareTo(String.valueOf(myNode.getKey())) > 0) {
					head = myNode;
					head.setNext(temp);
					flag = 1;
					break;
				}
				else {
					if ( temp.getNext() != null && String.valueOf(temp.getNext().getKey()).compareTo(String.valueOf(myNode.getKey())) > 0) {
						INode temp1 = temp.getNext();
						temp.setNext(myNode);
						temp = temp.getNext();
						temp.setNext(temp1);
						flag = 1;
						break;
					}
				}
				temp=temp.getNext();
			}
			if (flag == 0) {
				while (lastTemp.getNext() != null) {
					lastTemp = lastTemp.getNext();
				}
				lastTemp.setNext(myNode);
			}
		}
	}
	
	
	public void printSortedList() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode temp = this.head;
		while (temp != null) {
			printformat.append(temp.getKey());
			if ( temp.getNext() != null) {
				printformat.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(printformat);
	}
	
}

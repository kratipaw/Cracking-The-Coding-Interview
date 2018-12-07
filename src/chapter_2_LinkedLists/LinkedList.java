package chapter_2_LinkedLists;

public class LinkedList {

	Node head;
	
	public class Node {
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void push_atFront(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		
		head = newNode;
	}
	
	public void push_atEnd(int data) {
		Node newNode = new Node(data);
		
		//If the LL is empty then in that case first element added is newNode which is also head.
		if (head == null) {
			head = newNode;
			return;
		}
		
		//This node would be added at the end then make its next to null
		newNode.next = null;
		
		//Traverse till  the end of LL
		Node last = head;
		while (last.next!=null) {
			last = last.next;
		}
		
		last.next = newNode;
	}
	
	public int length() {
		Node element = head;
		int length = 0;
		while(element != null) {
			length++;
			element = element.next;
		}
		
		return length;
	}
	
	public void reverse() {
		
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while (current != null) 
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = current;
	}
	
	public void printLinkedList() {
		
		Node element = head;
		
		while(element != null) {
			System.out.print(element.data + "   ");
			element = element.next;
		}
		
		System.out.println();
	}
}

package chapter_2_LinkedLists;

import chapter_2_LinkedLists.LinkedList.Node;

public class _4_Partition {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		ll.push_atFront(1);
		ll.push_atFront(2);
		ll.push_atFront(10);
		ll.push_atFront(5);
		ll.push_atFront(8);
		ll.push_atFront(5);
		ll.push_atFront(3);
		
		
		System.out.println("Given Linked List is :: ");
		
		ll.printLinkedList();
		
		Node node = partition(ll, 5);
		
		System.out.println("Modified LinkedList is :: ");
		
		ll.head = node;
		
		ll.printLinkedList();
		
		
	}
	
	private static Node partition(LinkedList list, int x) {
		
		Node beforeStart = null; 
		Node beforeEnd = null;
		
		Node afterStart = null;
		Node afterEnd = null;
		
		Node current = list.head;
		
		while(current != null) 
		{
			Node next = current.next;
			current.next = null;
			if(current.data < x) 
			{
				if(beforeStart == null) 
				{
					beforeStart = current;
					beforeEnd = beforeStart;
				}
				else
				{
					beforeEnd.next = current;
					beforeEnd = current;
				}
			}
			else
			{
				if(afterStart == null) 
				{
					afterStart = current;
					afterEnd = afterStart;
				}
				else
				{
					afterEnd.next = current;
					afterEnd = current;
				}
			}
			
			current = next;
		}
		
		if(beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		
		return beforeStart;
	}

}

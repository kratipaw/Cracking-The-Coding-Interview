package chapter_2_LinkedLists;

import chapter_2_LinkedLists.LinkedList.Node;

public class _3_DeleteMiddleNode {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		ll.push_atFront(2);
		ll.push_atFront(5);
		ll.push_atFront(10);
		ll.push_atFront(2);
		ll.push_atFront(3);
		
		
		System.out.println("Given Linked List is :: ");
		
		ll.printLinkedList();
		
		deleteMiddleNode(ll.head.next.next);
		
		System.out.println("Modified LinkedList is :: ");
		
		ll.printLinkedList();
	}
	
	private static boolean deleteMiddleNode(Node node) {
		
		//Assuming that head of the linked list is not accessible, only node to be deleted is accessible
		
		if(node.next == null || node == null) {
			return false;
		}
		
		Node element = node.next;
		
		node.data = element.data;
		node.next = element.next;
		
		return true;
	}

}

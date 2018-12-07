package chapter_2_LinkedLists;

import java.util.HashSet;

import chapter_2_LinkedLists.LinkedList.Node;

public class _1_RemoveDups {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		ll.push_atFront(2);
		ll.push_atFront(5);
		ll.push_atFront(10);
		ll.push_atFront(2);
		ll.push_atFront(3);
		
		
		System.out.println("Given Linked List is :: ");
		
		ll.printLinkedList();
		
		removeDups(ll);
		
		System.out.println("Modified LinkedList is :: ");
		
		ll.printLinkedList();
		
		removeDups_v2(ll);
		
		System.out.println("Modified LinkedList is :: ");
		
		ll.printLinkedList();
		
		
	}

	//Time Complexity : O(n) where n is number of elements in the list 
	//Space Complexity: O(n) where n is number of elements in the list
	private static void removeDups(LinkedList list) {
		
		HashSet<Integer> lookupSet = new HashSet<Integer>();
		
		Node current = list.head;
		Node prev = null;
		
		while(current != null) {
			
			int val = current.data;
			
			if(lookupSet.contains(val)) {
				prev.next = current.next;
			}else {
				lookupSet.add(val);
				prev = current;
			}
			
			current = current.next;
		}
	}
	
	//Time Complexity : O(n^2) where n is number of elements in the list  
	//Space Complexity: O(1)
	private static void removeDups_v2(LinkedList list) {
		
		Node current = list.head;
		
		while(current != null) {
			 Node runner = current;
			 
			 while(runner.next != null) {
				 if(runner.next.data == current.data) {
					 runner.next = runner.next.next;
				 }else {
					 runner = runner.next;
				 }
			 }
			 
			 current = current.next;
		}
	}
}

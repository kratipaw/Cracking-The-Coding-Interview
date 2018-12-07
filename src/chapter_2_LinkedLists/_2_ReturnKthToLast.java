package chapter_2_LinkedLists;

import chapter_2_LinkedLists.LinkedList.Node;

public class _2_ReturnKthToLast {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		ll.push_atFront(21);
		ll.push_atFront(56);
		ll.push_atFront(10);
		ll.push_atFront(29);
		ll.push_atFront(35);
		
		
		System.out.println("Given Linked List is :: ");
		
		ll.printLinkedList();
		
		int k = 2;
		
		System.out.println("Element at " + k + "th position from end is : " + findKthToLastElement(ll, k));
		
	}

	private static int findKthToLastElement(LinkedList list, int k) {
		
		int len = list.length();
		
		int find = len - k;
		
		Node element = list.head;
		
		int count = 0;
		
		int result = 0;
		
		while(element != null) {
			count++;
			if(count == find) {
				result = element.data;
				break;
			}
			element = element.next;
		}
		
		return result;
		
	} 
}

package chapter_3_StacksAndQueues;

public class _4_QueueViaStacks {

	public static void main(String[] args) {

		MyQueue que = new MyQueue();
		
		que.stack.push(2);
		que.stack.push(5);
		que.stack.push(1);
		que.stack.push(7);
		que.stack.push(3);
		que.stack.push(9);
		
		que.print();
		
		System.out.println("Top element is : " + que.peek());
	}

}

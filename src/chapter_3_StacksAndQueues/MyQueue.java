package chapter_3_StacksAndQueues;

import java.util.Stack;

//Queue is FIFO :: add(), remove(), peek(), isEmpty()
//Stack is LIFO

public class MyQueue extends Stack<Integer> 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> queue = new Stack<Integer>();
 	
	public void add(int item)
	{
		//if(stack.isEmpty())
			stack.push(item);
		/*else
			System.out.println("Problem !!");*/
	}
	
	public void shiftToQueue()
	{
		if(queue.isEmpty())
		{
			while(!stack.isEmpty())
			{
				queue.push(stack.pop());
			}
		}
		
	}
	
	public int remove()
	{
		shiftToQueue();
		return queue.pop();
	}
	
	public Integer peek()
	{
		shiftToQueue();
		return queue.peek();
	}
	
	public void print()
	{
		shiftToQueue();
		
		for(int i : queue)
		{
			System.out.print(i + "   ");
		}
		System.out.println();
	}
	
}

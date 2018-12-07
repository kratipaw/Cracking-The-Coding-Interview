package chapter_3_StacksAndQueues;

import java.util.Stack;

public class CustomStack extends Stack<Integer>{ 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int size;
	
	public CustomStack(int cap) {
		super();
		
		super.setSize(cap);
	}
	
	public void push(int item)
	{
		super.push(item);
		size++;
	}
	
	public Integer pop() 
	{
		size--;
		return super.pop();
	}
	
	public boolean isEmpty()
	{
		return super.isEmpty();
	}
	
	public boolean isFull()
	{
		if(super.capacity() == size)
			return true;
		
		return false;
	}
}

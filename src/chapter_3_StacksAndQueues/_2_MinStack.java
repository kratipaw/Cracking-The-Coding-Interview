package chapter_3_StacksAndQueues;

import java.util.Stack;

public class _2_MinStack extends Stack<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Stack<Integer> min = new Stack<>();
	
	public void push(int item) 
	{
		if(isEmpty() == true)
		{
			super.push(item);
			min.push(item);
		}
		else
		{
			super.push(item);
			int prev = min.peek();
			if(prev < item)
				min.push(prev);
			else
				min.push(item);
		}
	}
	
	public Integer pop() 
	{
		if(isEmpty() == false)
		{
			int item = super.pop();
			min.pop();
			return item;
		}
		
		System.out.println("Stack is empty..");
		return 0;
	}
	
	public Integer min()
	{
		int item = min.peek();
		return item;
	}
	
	public void print()
	{
		if(isEmpty() != true)
		{
			System.out.println("Given stack is : ");
			for (int i : this) {
				System.out.print(i + "   ");
			}
			System.out.println();
			System.out.println("Given min stack is : ");
			for (int i : this.min) {
				System.out.print(i + "   ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("stacks are empty !!");
		}
		
	}
	public static void main(String[] args) {

		_2_MinStack min = new _2_MinStack();
		
		min.push(5);
		min.push(2);
		min.push(7);
		min.push(9);
		min.push(3);
		min.push(1);

		min.print();
		
		System.out.println("Min is  :  " + min.min());
		
		System.out.println("After popping :::  ");
		
		min.pop();
		
		min.print();
		
		System.out.println("Min is  :  " + min.min());
	}

}

package chapter_3_StacksAndQueues;

import java.util.ArrayList;

public class _3_SetOfStacks {

	ArrayList<CustomStack> stacks = new ArrayList<CustomStack>();
	
	int capacity;
	
	public _3_SetOfStacks(int cap) {
		capacity = cap;
	}
	
	public CustomStack getLastStack()
	{
		if(stacks.size() == 0)
			return null;
		
		return stacks.get(stacks.size()-1);
	}
	
	public boolean isEmpty()
	{
		CustomStack last = getLastStack();
		
		if(last == null || last.isEmpty())
			return true;
		
		return false;
	}
	
	public boolean isFull(CustomStack last)
	{
		if(last.size() == capacity)
			return true;
		
		return false;
	}
	
	public void push(int item)
	{
		CustomStack last = getLastStack();
		
		if(last != null && !isFull(last))
			last.push(item);
		else
		{
			CustomStack newStack = new CustomStack(capacity);
			newStack.push(item);
			stacks.add(newStack);
		}
			
	}
	
	public int pop()
	{
		CustomStack last = getLastStack();
		
		int popped = 0;
		
		if(last != null || !last.isEmpty())
		{
			popped = last.pop();
			if(last.size() == 0)
				stacks.remove(last);
		}
		else
		{
			System.out.println("Empty!!");
		}
		return popped;
	}
	
	public void print()
	{
		while (!stacks.isEmpty()) {
			CustomStack last = getLastStack();
			for (int i = 0; i < last.size(); i++) {
				System.out.print(last.get(i) + "   ");
			}
			System.out.println();
		}
	}
}

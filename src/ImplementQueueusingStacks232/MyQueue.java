package ImplementQueueusingStacks232;

import java.util.Stack;

public class MyQueue {
	
	private static Stack<Integer> stack;

	public static void main(String[] args) {
		stack.add(1);
		System.out.println(stack.peek());
		stack.push(2);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		if(stack.isEmpty())
			System.out.println("Empty");
		else
			System.out.println("Not empty");
	}
	
	public MyQueue(){
		stack = new Stack<Integer>();
	}
	
	public void push(int x){
		stack.add(0, x);
	}
	
	public int pop(){
		if(empty()){
			return -1;
		}
		int i = stack.pop();
		return i;
	}
	
	public int peek(){
		if(empty()){
			return -1;
		}
		return stack.peek();
	}
	
	public boolean empty(){
		boolean flag = stack.isEmpty();
		return flag;
	}

}

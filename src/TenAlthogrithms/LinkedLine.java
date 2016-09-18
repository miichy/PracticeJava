package TenAlthogrithms;

public class LinkedLine {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(new Node(1));
		stack.push(new Node(2));
		stack.push(new Node(3));
		stack.push(new Node(4));
		stack.push(new Node(5));
		
		System.out.println(stack.peek().val);
		
		stack.pop();
		System.out.println(stack.peek().val);
		
		Queue q = new Queue();
		q.enqueue(new Node(1));
		System.out.println(q.dequeue().val);
		q.first = new Node(10);
		q.last = new Node(11);
		System.out.println(q.dequeue().val);
	}

}

class Node{
	
	int val;
	Node next;
	
	Node(int x){
		val = x;
		next = null;
	}
	
}

class  Stack{
	Node top;
	
	public Node peek(){
		if(top != null){
			return top;
		}
		
		return null;
	}
	
	public Node pop(){
		if(top == null){
			return null;
		}else{
			Node tmp = new Node(top.val);
			top = top.next;
			return tmp;
		}
	}
	
	public void push(Node n){
		if(n != null){
			n.next = top;
			top = n;
		}
	}
	
}

class Queue{
	Node first,last;
	
	public void enqueue(Node n){
		if(first == null){
			first = n;
			last = first;
		}else{
			last.next = n;
			last = n;
		}
	}
	
	public Node dequeue(){
		if(first == null){
			return null;
		}else{
			Node tmp = new Node(first.val);
			first = first.next;
			if(last == tmp) 
				last = first;
			return tmp;
		}
	}
}
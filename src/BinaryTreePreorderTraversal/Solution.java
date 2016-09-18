package BinaryTreePreorderTraversal;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		
		
	}
	
	public ArrayList<Integer> preorderTravelsal(TreeNode root){
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		if(root == null)
			return resultList;
		
		Stack stack = new Stack();
//		stack.push(root);
//		
//		while(!stack.empty()){
//			TreeNode n = stack.pop();
//			resultList.add(n.val);
//			
//			if(n.right != null){
//				stack.push(n.right);
//			}
//			if(n.left != null){
//				stack.push(n.left);
//			}
//		}
		return resultList;
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
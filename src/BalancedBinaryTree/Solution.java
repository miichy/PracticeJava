package BalancedBinaryTree;

import java.util.Stack;

import SameTree.TreeNode;

public class Solution {
	/**
	 * a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
	 * @param root
	 * @return
	 */
    public boolean isBalanced(TreeNode root) {
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(root);
    	Stack<TreeNode> unVisitedStack = new Stack<TreeNode>();
    	unVisitedStack.push(root);
    	TreeNode cur = root;
    	
    	if(cur == null){
    	    return true;
    	}
    	
    	while(!unVisitedStack.empty()){
    		cur = unVisitedStack.pop();
    		if(cur.left != null && cur.right != null){
        		if((Math.abs(cur.left.val - cur.right.val) > 1)||(Math.abs(cur.val - cur.right.val) > 1)||(Math.abs(cur.left.val - cur.val) > 1)){
        			return false;
        		}
        		stack.push(cur);
        		unVisitedStack.push(cur.left);
        		unVisitedStack.push(cur.right);
        	}
    	}
    	
    	return true;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		right.left = new TreeNode(4);
		right.right = new TreeNode(5);
		
		Solution s = new Solution();
		if(s.isBalanced(root)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}

package BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import SameTree.TreeNode;

public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();  
	          if(root == null) 
	              return res;  
	          
	          LinkedList<TreeNode> queue = new LinkedList<TreeNode>();  
	          queue.add(root);  
	          int curLevCnt = 1;  
	          int nextLevCnt = 0;  
	         ArrayList<Integer> levelres = new ArrayList<Integer>();  
	         
	         while(!queue.isEmpty()){  
	             TreeNode cur = queue.poll();  
	             curLevCnt--;  
	             levelres.add(cur.val);  
	             
	             if(cur.left != null){  
	                 queue.add(cur.left);  
	                 nextLevCnt++;  
	             }  
	             if(cur.right != null){  
	                 queue.add(cur.right);  
	                 nextLevCnt++;  
	             }  
	               
	             if(curLevCnt == 0){  
	                 curLevCnt = nextLevCnt;  
	                 nextLevCnt = 0;  
	                 res.add(levelres);  
	                 levelres = new ArrayList<Integer>();  
	             }  
	         }  
	         return res;  
    }
    
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {  
	        ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();  
	        helper(root, 0, tree); // use ArrayList as parameter so that recurcive function can use it without defininition  
	        Collections.reverse(tree);  
	        return tree;  
    }  
      
    public void helper(TreeNode node, int depth, ArrayList<ArrayList<Integer>> tree){  
	        if (node == null) return; //exit  
	          
	        ArrayList<Integer> leaf = null; // leaf array list may got from tree array list or newly created  
	        if(depth<tree.size()) {  
	            leaf = tree.get(depth); // same depth, got from tree array list (current leaf)  
	        }else{  
	            leaf = new ArrayList<Integer>(); // new depth, create new leaf array list for this depth  
	            tree.add(leaf);  
	        }  
	        leaf.add(node.val); // add current node value to leaf array list  
	          
	        // process next depth  
	        helper(node.left, depth+1,tree);  
	        helper(node.right, depth+1, tree);  
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
		ArrayList<ArrayList<Integer>> re = s.levelOrder(root);
		System.out.println(re);
		
		re = s.levelOrderBottom(root);
		System.out.println(re);

	}

}

package MaximumDepthofBinaryTree;

import java.util.Queue;
import java.util.Stack;

import SameTree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
    	int depth1 = 0,depth2=0;
    	TreeNode cur1 = root;
    	TreeNode cur2 = root;
    	if(cur1.left != null){
    		depth1 += 1;
    		maxDepth(cur1.left);
    	}
    	
    	if(root.left != null  && root.right != null){
    		depth1 +=1;
    	}
    	
    	if(cur2.right != null){
    		depth2 += 1;
    		maxDepth(cur1.right);
    	}
        
    	return depth1 >= depth2 ? depth1 : depth2;
    }
    
    public int DFS (TreeNode root){
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(root);
    	int curPushCnt = 1;
    	int lastCnt = 0;
    	int sum = 0;

    	if(root == null){
    		return 0;
    	}
    	
    	while(!stack.empty()){
    		TreeNode cur = stack.pop();
    		curPushCnt -= 1;
    		
    		if(cur.left != null || cur.right != null){
    			
    			if(cur.left != null){
    				lastCnt += 1;
        			stack.push(cur.left);
        			
        		}
        		
        		if(cur.right != null){
        			lastCnt += 1;
        			stack.push(cur.right);
        		}
    		}
    		
    		if(curPushCnt == 0){
				sum += 1;
				curPushCnt = lastCnt;
				lastCnt = 0;
			}
    		
    	}
    	
    	return sum;
    	
    }
    
    public void BFS(TreeNode root){
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(root);
    	Stack<TreeNode> unVisitedStack = new Stack<TreeNode>();
    	unVisitedStack.push(root);
    	TreeNode cur = root;
    	
    	while(!unVisitedStack.empty()){
    		cur = unVisitedStack.pop();
    		while(cur.left != null){
        		cur = cur.left;
        		unVisitedStack.push(cur);
        	}
        	
        	stack.push(cur);
        	System.out.println(cur.val);
        	
        	while(cur.right != null){
        		cur = cur.right;
        		unVisitedStack.push(cur);
        	}
    	}
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
		System.out.println(s.maxDepth(root));
		
		TreeNode newRoot = new TreeNode(1);
		TreeNode r2 = new TreeNode(2);
		TreeNode r3 = new TreeNode(3);
		newRoot.left = r2;
		r2.left = r3;
		r3.left = left;
		
		System.out.println(s.DFS(root));
		
		s.BFS(newRoot);

	}

}

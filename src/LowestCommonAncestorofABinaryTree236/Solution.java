package LowestCommonAncestorofABinaryTree236;

import java.util.ArrayList;
import java.util.List;

public class Solution {
/**
 *      _______1______
       /              \
    ___2__          ___3__
   /      \        
  4       5      
 * @param args
 */
	public static void main(String[] args) {
		TreeNode tRoot = new TreeNode(1);
		TreeNode tOneLeft = new TreeNode(2);
		TreeNode tOneRight = new TreeNode(3);
		TreeNode tTwoLeft = new TreeNode(4);
		TreeNode tTwoRight = new TreeNode(5);
		tRoot.left = tOneLeft;
		tRoot.right = tOneRight;
		tOneLeft.left = tTwoLeft;
		tOneLeft.right = tTwoRight;
		List<TreeNode> visited = new ArrayList<TreeNode>();
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q){
		
		return null;
	}
	
	public void dfs(TreeNode cur,List<TreeNode> visited){
		if(visited.contains(cur))
			return ;
		visited.add(cur);
//		if()
	}

}

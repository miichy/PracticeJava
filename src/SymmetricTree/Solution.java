package SymmetricTree;

import SameTree.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
    	
    	if(root == null){
    		return true;
    	}
    	if(isSame(root.left, root.right))
    		return true;
    	else
    		return false;
        
    }
    
    public boolean isSame(TreeNode p,TreeNode q){
    	if( p == null && q == null)
    		return true;
    	if((p==null && q != null)||(p != null && q == null)||(p.val != q.val))
    		return false;
    	
    	return isSame(p.left, q.right) && isSame(p.right, q.left);
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.right = new TreeNode(2);
		
		Solution s = new Solution();
		if(s.isSymmetric(t)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}

package SameTree;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	
    	if( q==null && p == null){
    		return true;
    	}
    	
    	if( (q==null && p!=null)||(p == null && q !=null) || (q.val != p.val) )
    		return false;
    	
    	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    	
    }
    
    public static void main(String[] args) {
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.right = new TreeNode(3);
		
		TreeNode tt = new TreeNode(1);
		tt.left = new TreeNode(2);
		tt.right = new TreeNode(3);
		
		Solution s  = new Solution();
		
		if(s.isSameTree(t, tt)){
			System.out.println("YES");
		}else{
			System.out.println("NOPE");
		}
	}

}

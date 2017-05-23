package SumofLeftLeaves;

public class Solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(5);
		TreeNode right = new TreeNode(7);
		root.left = left;
		root.right = right;
		Solution s = new Solution();
		
		System.out.println(s.sumOfLeftLeaves(root));

	}
	
    public int sumOfLeftLeaves(TreeNode root) {
    	int sum = 0;
		if(root == null)
			return 0;
		dfs(root);
		return sum;
	}
	
	public int  dfs(TreeNode root){
		int number = 0;
		if(root == null)
			return 0;
		dfs(root.left);
		dfs(root.right);
		return number;
		
	}

}

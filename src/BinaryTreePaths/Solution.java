package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode five = new TreeNode(5);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		
		two.right = five;
		root.left = two;
		root.right = three;
		
		List<String> res = binaryTreePaths(root);
		
		for(int i = 0;i < res.size(); i++){
			System.out.println(res.get(i));
		}
		
	}
	
    public static List<String> binaryTreePaths(TreeNode root) {
    	List<String> res = new ArrayList<String>();
    	
    	if(root == null){
    		return res;
    	}
    	
    	if(root.left == null && root.right == null){
    		res.add(String.valueOf(root.val));
    	}else{
    		for(String s : binaryTreePaths(root.left)){
    			res.add(String.valueOf(root.val) + "->" + s);
    		}
    		for(String s : binaryTreePaths(root.right)){
    			res.add(String.valueOf(root.val) + "->" + s);
    		}
    	}
    	
    	return res;
    	
    }

}

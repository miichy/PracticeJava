package Combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int n = 4;
		int k = 2;
		ArrayList<ArrayList<Integer>> a = s.combine(n, k);
		System.out.println("hello");
	}
	
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if(n <= 0 || k > n)
    		return result;
        
    	ArrayList<Integer> item = new ArrayList<Integer>();
        dfs(n,k,1,item,result);
        
    	return result;
    }
    
    public void dfs(int n,int k,int start, ArrayList<Integer> item,ArrayList<ArrayList<Integer>> result){
    	if(item.size() == k){
    		result.add(new ArrayList<Integer>(item));
    		return;
    	}
    	
    	for(int i = start;i <= n ;i++){
    		item.add(i);
    		dfs(n,k,i+1,item,result);
    		item.remove(item.size() - 1);
    	}
    }

}

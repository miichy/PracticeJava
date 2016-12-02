package Subsets;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,4,3,2};
		ArrayList<ArrayList<Integer>> a = s.subsets(nums);
		System.out.println("world");
	}
	
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
    	if (nums ==  null)
    		return null;
    	Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> sets = new ArrayList<ArrayList<Integer>>();
        
        int len = nums.length;
        
        for(int i = 0;i < len;i++){
        	ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        	for(ArrayList<Integer> a : sets){
        		temp.add(new ArrayList<Integer>(a));
        	}
        	
        	for(ArrayList<Integer> a : temp){
        		a.add(nums[i]);
        	}
        	ArrayList<Integer> single = new ArrayList<Integer>();
        	single.add(nums[i]);
        	temp.add(single);
        	
        	sets.addAll(temp);
        }
        
        sets.add(new ArrayList<Integer>());
        return sets;
    }

}

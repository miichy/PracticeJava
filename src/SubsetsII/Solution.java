package SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		Solution s  = new Solution();
		ArrayList<ArrayList<Integer>> res = s.subsetsWithDuup(nums);
		System.out.println("world");

	}
	
	public ArrayList<ArrayList<Integer>> subsetsWithDuup(int[] nums){
		if(nums == null)
			return null;
		Arrays.sort(nums);
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> prev = new ArrayList<ArrayList<Integer>>();
		
		for(int i = nums.length - 1;i >= 0; i--){
			if(i == nums.length - 1 || nums[i] != nums[i+1] || prev.size() == 0){
				prev = new ArrayList<ArrayList<Integer>>();
				for(int j = 0;j < result.size();j++){
					prev.add(new ArrayList<Integer>(result.get(j)));
				}
			}
			for(ArrayList<Integer> tmp : prev){
				tmp.add(0,nums[i]);
			}
			if(i == nums.length - 1 || nums[i] != nums[i + 1]){
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				tmp.add(nums[i]);
				prev.add(tmp);
			}
			for(ArrayList<Integer> tmp : prev){
				result.add(new ArrayList<Integer>(tmp));
			}
			
		}
		result.add(new ArrayList<Integer>());
		return result;
		
	}

}

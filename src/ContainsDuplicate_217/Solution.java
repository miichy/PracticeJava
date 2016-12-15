package ContainsDuplicate_217;

import java.util.Arrays;

public class Solution {
	private int[] nums ;
	public Solution(int[] ns){
		this.nums = ns;
	}
	
    public boolean containsDuplicate(int[] nums) {
    	if(nums.length <= 1)
    		return false;
    	Arrays.sort(nums);
    	for(int i = 0;i < nums.length -1; i++){
    		if(nums[i] == nums[i+1])
    			return true;
    	}
    	return false;
    }
	
}

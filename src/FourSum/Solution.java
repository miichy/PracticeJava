package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {2,3,-4,-5,1,0};// {1,-1,0,2,-2,0};
		System.out.println(fourSum(nums, 0));

	}
	/**
	 * http://www.programcreek.com/2013/02/leetcode-4sum-java/
	 * @param nums
	 * @param target
	 * @return
	 */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(nums.length < 4)
    		return res;
    	
    	Arrays.sort(nums);
    	int first = 0;
    	int second = first + 1;
    	int third = second + 1;
    	int last = third + 1;
    	
    	for(;last < nums.length; last++){
    		if(nums[first]+nums[second]+nums[third]+nums[last] == target){
        		List<Integer> re = new ArrayList<Integer>();
    			re.add(nums[first]);
    			re.add(nums[second]);
    			re.add(nums[third]);
    			re.add(nums[last]);
    			res.add(re);
    			
        	}else if(nums[first]+nums[second]+nums[third]+nums[last] < target){
        		if(third < nums.length - 2){
        			third++;
            		last = third + 1;
        		}else{
        			if(second < nums.length - 3){
        				second++;
        				third = second + 1;
        				last = third+1;
        			}
        		}
        		
        	}
    	}
    	
    	return res;
    	/**
    	 * Wrong sample
    	 */
//    	int first = 0;
//    	int last = nums.length - 1;
//    	
//    	while((last - first) > 2){
//    		int result = target - nums[first] - nums[last];
//    		int start = first + 1;
//        	int end = last - 1;
//        	while(start < end){
//        		if(result == nums[start]+ nums[end]){
//        			List<Integer> re = new ArrayList<Integer>();
//        			re.add(nums[first]);
//        			re.add(nums[start]);
//        			re.add(nums[end]);
//        			re.add(nums[last]);
//        			
//        			res.add(re);
//        			start++;
//        			end--;
//        		}else if(result < nums[start] + nums[end]){
//        			end--;
//        		}else{
//        			start++;
//        		}	
//        	}
//        	first++;
//        	last--;
//    	}	
//    	
//    	
//    	return res;
    }

}

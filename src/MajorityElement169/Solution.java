package MajorityElement169;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,2,1,2,2,2,1,1,1,1,1};
		System.out.println(s.majorityElement(nums));
	}
	
    public int majorityElement(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return 0;
        
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < nums.length ;i++){
    		if(map.containsKey(nums[i]) )
    			map.put(nums[i], map.get(nums[i]) + 1);
    		else
    			map.put(nums[i], 1);
    	}
    	int index = -1;
    	int max = -1;
    	for(int i : map.keySet()){
    		if (map.get(i) > max){
    			max = map.get(i);
    			index = i;
    		}
    	}
    	
    	return index;
    }

}

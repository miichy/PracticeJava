package IntersectionofTwoArrays349;

import java.util.HashMap;
import java.util.Map;

/**
 * [4,7,9,7,6,7]
 * [5,0,0,6,1,6,2,2,4]
 * @author liuke
 *
 */

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		int[] res = s.intersection(nums1, nums2);
		for(int i = 0;i < res.length;i++){
			System.out.println(res[i]);
		}
	}

    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0|| nums2.length == 0){
        	return null;
        }
        int[] numsOne = eraseDuplicate(nums1);
        int[] numsTwo = eraseDuplicate(nums2);
        int[] res1 = sort(numsOne);
        int[] res2 = sort(numsTwo);
        
        int len1 = res1.length;
        int len2 = res2.length;
        int len = len1 <= len2?len1: len2;
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < len ; i++){
        	if(len1 <= len2){
        		exists(nums1[i],nums2);
        		sb.append(nums1[i]);
        	}else{
        		exists(nums2[i],nums1);
        		sb.append(nums2[i]);
        	}
        }
        
        int l = sb.toString().length();
        int[] res = new int[l];
        for(int i = 0; i < l ;i++){
        	res[i] = Character.getNumericValue(sb.charAt(i));
        }
        
    	return res;
    }
    
    public boolean exists(int a,int[] nums){
    	if(a < 0 || nums == null){
    		return false;
    	}
    	int len = nums.length;
    	for(int i  = 0 ;i < len; i++){
    		if(a == nums[i])
    			return true;
    	}
    	return false;
    }
    
    public int[] eraseDuplicate(int[] nums){
    	if (nums == null || nums.length == 0){
    		return nums;
    	}
    	int len = nums.length;
    	Map<Integer,Integer> staff = new HashMap<Integer, Integer>();
    	for(int i = 0;i < len;i++){
    		if (staff.containsKey(nums[i])){
    			staff.put(nums[i], staff.get(nums[i]) + 1);
    		}else{
    			staff.put(nums[i], 1);
    		}
    	}
    	
    	int siz = staff.size();
    	int[] res = new int[siz];
    	int start = 0;
    	while(start < siz){
	    	for(Integer i : staff.keySet()){
	    		res[start] = i;
	    		start++;
	    	}
    	}
    	
    	return res;
    }
    
    public int[] sort(int[] nums){
    	if (nums == null || nums.length == 0){
    		return nums;
    	}
    	
    	int len = nums.length;
    	for (int i = 0;i < len -1 ;i++){
    		int min = i;
    		for(int j = i + 1; j < len;j++){
    			if(nums[j] < nums[min]){
    				min = j;
    			}
    		}
    		int tmp = nums[min];
    		nums[min] = nums[i];
    		nums[i] = tmp;
    		
    	}
    	return nums;
    }
    
    
}

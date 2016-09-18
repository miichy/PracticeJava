package MoveZeroes;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 0, 3, 12};
		moveZeroes(nums);
	}
	
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        if(len <= 1)
        	return ;
        
        int zeroNums = 0;
    	for(int i = 0;i < len; i++){
    		if(nums[i] != 0){
    			if(zeroNums != 0){
    				//move the index of zeroNums from i-> len
    				move(nums, zeroNums, i, len);
    				i -= zeroNums;
    			}
    			zeroNums = 0;
    		}else{
    			zeroNums++;
    		}
    	}
    	
    	for(int i = 0;i < len;i++){
    		System.out.println(nums[i]);
    	}
    	
    }
    
    public static int[] move(int[] nums,int zeroNums,int i,int len){
    	for(int j = i -zeroNums;j<len-zeroNums;j++){
    		nums[j] = nums[j+zeroNums];
    	}
    	for(int j = len-zeroNums;j<len;j++){
    		nums[j] = 0;
    	}
    	return nums;
    	
    }

}

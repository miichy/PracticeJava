package FindPeakElement;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {4,3,3,4,1};
		System.out.println(findPeakElement(nums));
	}
	
    public static int findPeakElement(int[] nums) {
//    	int len = nums.length;
//    	if (len <= 0)
//    		return -1;
//    	if (len == 1){
//    		return 0;
//    	}
//    	if (len == 2){
//    		if (nums[1] < nums[0])
//    			return 0;
//    		else
//    			return 1;
//    	}
//    	
//    	for(int i = 1;i < len -1;i++){
//    		if((nums[i - 1] < nums[i]) && (nums[i] > nums[i + 1])){
//    			return i;
//    		}
//    	}
//        
//    	return len;
    	
    	int len = nums.length;
    	boolean flag = true;
    	for(int i = 0;i < len - 1;i++){
    		if(flag && (nums[i] > nums[i+1])){
    			return i;
    		}else if(nums[i] < nums[i+1]){
    			flag = true;
    		}else{
    			flag = false;
    		}
    	}
    	
    	return len - 1;
    }
}

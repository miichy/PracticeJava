package ThreeSumClosest;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums =  {1,1,1,0};
		System.out.println(threeSumClosest(nums, -100));
	}
	
	public static int threeSumClosest(int[] nums,int target){
		if(nums.length == 3){
			return nums[0]+nums[1]+nums[2];
		}
		
		Arrays.sort(nums);
		int result = target;
		int sum = 0;
		
		for(int i=0;i < nums.length-2;i++){
			int negalet = target - nums[i];
			int start = i + 1;
			int end = nums.length - 1;
			
			result = nums[start]+nums[end]+nums[i];
			
			while(start < end){
				if(nums[start] + nums[end] == negalet){
					result = target;
					return result;
				}else if(nums[start] + nums[end] < negalet){
//					result = result < target - Math.abs(nums[start]+nums[end]+nums[i]) ? result : target - Math.abs(nums[start]+nums[end]+nums[i]);
					if(result > target - Math.abs(nums[start]+nums[end]+nums[i]))
						sum = nums[start]+nums[end]+nums[i];
					else{
						sum = result;
						}
					start++;
				}else{
//					result = result < Math.abs(nums[start]+nums[end]+nums[i])- target ? result : Math.abs(nums[start]+nums[end]+nums[i]) - target;
					if(result > Math.abs(nums[start]+nums[end]+nums[i])- Math.abs(target))
						sum = nums[start]+nums[end]+nums[i];
					else{
						sum = result;
					}
					end--;
				}
			}
			
		}
		
		return sum;
	}

}

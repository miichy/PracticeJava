package RangeSumQuery;

public class NumArray {
	
	public int[] nums;
	
	public NumArray(int[] nums){
		this.nums = nums;
	}
	
	public int sumRange(int i,int j){
		int len = nums.length;
		int sum = 0;
		if((i > j) || (j > len))
			return 0;
		
		for(int k=i;k<=j; k++){
			sum += nums[k];
		}
		
		return sum;
	}

}

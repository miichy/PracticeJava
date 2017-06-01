package RotateArray189;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums  = {1,2,3,4,5,6,7};
		int k = 3;
		s.rotate(nums, k);
		for(int i = 0;i < nums.length;i++){
			System.out.println(nums[i]);
		}
	}
	
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k > len){
        	k = len - 1;
        }else if(k <= 0){
        	return ;
        }
        int offset = len - k - 1;
        
        for(int i = 0 ; i < offset; i++){
        	int tmp = nums[k + i + 1];
        	for(int j = k + i; j >= i; j--){
        		nums[j+1] = nums[j];
        	}
        	nums[i] = tmp;
        }
        
    }

}

package ThirdMaximumNumber414;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int thirdMax(int[] nums) {
        int[] result = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        int re = 0;
        
        if(nums == null || nums.length == 0)
        	return re;
        int len = nums.length;
        
        for(int i = 0;i < len;i++){
        	int tmp1 = nums[i];
        	for(int j = 0;j < 3;j++){
        		if (tmp1 > result[j]){
        			int tmp2 = result[j];
        			result[j] = tmp1;
        			tmp1 = tmp2;
        		}else if (tmp1 == result[j])
        			continue;
        	}
        }
        
    	return re=(result[2]>Integer.MIN_VALUE? result[2] : result[0]);
    }

}

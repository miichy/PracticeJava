package TwoSumII;

public class Solution {

	public static void main(String[] args) {
		int[] numbers = {2,7,11,13};
		int target = 9;
		int[] res = new int[2];
		res = twoSum(numbers, target);
		for(int i = 0; i < res.length;i++){
			System.out.println(res[i]);
		}

	}

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        
        int len = numbers.length;
        if(len < 2)
        	return null;
        int start = 0;
        int end = len - 1;
        
        while(start < end){
        	if(numbers[start] + numbers[end] == target){
        		res[0] = start + 1;
        		res[1] = end + 1;
        		return res;
        	}else if(numbers[start] + numbers[end] < target){
        		start++;
        	}else{
        		end--;
        	}
        		
        }
        
    	return res;
    }
    
}

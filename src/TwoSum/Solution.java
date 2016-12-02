package TwoSum;

public class Solution {
	/**
	 * Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

	 * @param numbers
	 * @param target
	 * @return
	 */    
	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		int len = numbers.length;
		if(len < 2){
			return null;
		}
		for(int i = 1 ;i < len;i++){
			for(int j = 0;j < i;j++){
				if(numbers[i] + numbers[j] == target){
					res[0] = j;
					res[1] = i;
					return res;
				}
			}
		}
		
		return res;		
	}

}

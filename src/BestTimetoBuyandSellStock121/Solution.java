package BestTimetoBuyandSellStock121;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] prices = {7,1,5,3,6,4};
		System.out.println(s.maxProfit(prices));

	}
	
    public int maxProfit(int[] prices) {
    	if(prices == null || prices.length <= 1){
    		return 0;
    	}
    	int len = prices.length;
    	
    	int[] offset = new int[len - 1];
    	for(int i = 0;i < offset.length;i++){
    		offset[i] = prices[i+1] - prices[i];
    		System.out.println(offset[i]);
    	}
    	return maxSum(offset);
    }
    
    public int maxSum(int[] prices){
        int maxSum = 0,thisSum = 0;
        for(int j = 0 ; j < prices.length; j++){
        	thisSum += prices[j];
        	if(thisSum > maxSum)
        		maxSum = thisSum;
        	else if(thisSum < 0)
        		thisSum = 0;
        }
        return maxSum;
    }

}

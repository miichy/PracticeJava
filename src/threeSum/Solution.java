package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        int len = num.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        Arrays.sort(num);
        
        if(len < 3){
        	return res;
        }
        
        for(int i = 0 ;i < len - 2; i++){
        	if(i == 0 || num[i] >  num[i-1]){
        		int negat = -num[i];
        		int start = i +1;
        		int end = len -1;
        		
        		while(start < end){
        			if(num[start] + num[end] == negat){
        				 List<Integer> temp = new ArrayList<Integer>();
        				 temp.add(num[i]);
        				 temp.add(num[start]);
        				 temp.add(num[end]);
        				 
        				 res.add(temp);
        				 start++;
        				 end--;
        				 
//        				 while(start < end && num[start] == num[start + 1])
        				 while(start < end && num[start] == num[start - 1])
        					 start++;
        				 
//        				 while(start < end && num[end] == num[end - 1])
        				 while(start < end && num[end] == num[end + 1])
        					 end--;
        				 
        				 
        			}else if(num[start] + num[end] < negat){
        				start++;
        			}else {
        				end--;
        			}
        		}
        	}
        }
        
    	return res;
    }
    
    public List<List<Integer>> decompose(int[] num){
    	List<Integer> neg = new ArrayList<Integer>();
    	List<Integer> nonNeg = new ArrayList<Integer>();
    	List<Integer> zero = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        int len = num.length;
        
        for(int i = 0;i < len -1;i++){
        	if(num[i] == 0){
        		zero.add(0);
        	}else if(num[i] > 0){
        		nonNeg.add(num[i]);
        	}else{
        		neg.add(num[i]);
        	}
        }
        
        res.add(zero);
        res.add(nonNeg);
        res.add(neg);
        
    	return res;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] num = {-1,1,-1,0,2,-3};
		s.threeSum(num);
		System.out.println("YES");
	}

}

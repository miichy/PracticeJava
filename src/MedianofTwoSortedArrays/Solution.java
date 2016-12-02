package MedianofTwoSortedArrays;

public class Solution {

	public static void main(String[] args) {
		Solution s  = new Solution();
		int[] nums1 = {1,3};
		int[] nums2 = {2,4};
		System.out.println(s.findMedianSortedArrays(nums1, nums2));

	}
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int len1 = nums1.length,len2 = nums2.length;
    	int len = len1 + len2;
    	int[] news = new int[len];
    	int i = 0,j = 0;
    	
    	if(len == 0){
    		return 0;
    	}else if(len == len1){
    		// only the nums1
    		news = nums1;
    	}else if(len == len2){
    		// only the nums2
    		news = nums2;
    	}else{
    		while(i < len1 || j < len2){
        		for(int k = 0;k < len;k++){
        			if(i == len1){
        				news[k] = nums2[j];
        				j++;
        			}else if(j == len2){
        				news[k] = nums1[i];
        				i++;
        			}else{
        				if(nums1[i] < nums2[j]){
            				news[k] = nums1[i];
            				i++;
            			}else{
            				news[k] = nums2[j];
            				j++;
            			}
        			}
        			
        			
        		}
        	}
    	}
    	
    	if(len % 2 != 0){
    		return (double)news[len/2];
    	}else{
    		return (double)(news[len/2 - 1] + news[len/2]) / 2;
    	}
    }

}

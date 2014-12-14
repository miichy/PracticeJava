package ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0,j = height.length -1;
        while(i < j){
        	area = Math.max(area, (j-i)*Math.min(height[i], height[j]));  
            if(height[i] >= height[j]){
            	j--;
            }else{
            	i++;
            }
        	
        }
    	return area;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] height = {1,0,3,4,1,0,7,1,0};
		System.out.println(s.maxArea(height));

	}

}

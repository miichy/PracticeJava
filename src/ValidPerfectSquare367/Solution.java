package ValidPerfectSquare367;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPerfectSquare(16));
	}
	
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while(num > 0){
        	num -= i;
        	i += 2;
        }
    	return num == 0;
    }

}

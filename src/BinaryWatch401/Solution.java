package BinaryWatch401;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		System.out.println(Integer.bitCount(7));
		Solution s = new Solution();
		System.out.println(s.readBinaryWatch(4));
	}
	
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<String>();
        for(int h = 0;h < 12;h++){
        	for(int m = 0;m < 60;m++){
        		if(Integer.bitCount(h * 64 + m) == num)
        			times.add(String.format("%d:%02d", h,m));
        	}
        }
        
        return times;
    }

}

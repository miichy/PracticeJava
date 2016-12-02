package GrayCode;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		Solution s  = new Solution();
		ArrayList r = s.grayCode(3);
		for(int i = 0; i <= r.size() - 1; i++){
			System.out.println(r.get(i));
		}

	}
	
	public ArrayList<Integer> grayCode(int n){
		if(n == 0){
			ArrayList<Integer> result = new ArrayList<Integer>();
			result.add(0);
			return result;
		}
		ArrayList<Integer> tmp = grayCode(n - 1);
		int addNumber = 1 << (n - 1);
		ArrayList<Integer> result = new ArrayList<Integer>(tmp);
		
		for(int i = tmp.size() - 1; i >= 0;i--){
			result.add(addNumber + tmp.get(i));
		}
		return result;
	}

}

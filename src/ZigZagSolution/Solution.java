package ZigZagSolution;

public class Solution {
	
	public String convert(String s,int rowNum){
		int lengthCnt = s.length();
		StringBuilder strB = new StringBuilder();
		for(int index =0; index < lengthCnt;index = index + rowNum + 1){
			strB.append(s.charAt(index));
		}
		for(int i=1;i < lengthCnt;i = i +2){
			strB.append(s.charAt(i));
		}
		for(int i=2;i < lengthCnt;i = i + rowNum + 1){
			strB.append(s.charAt(i));
		}
		return strB.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int rowNum = 3;
		Solution solution = new Solution();
		System.out.println(solution.convert(s, rowNum));

	}

}

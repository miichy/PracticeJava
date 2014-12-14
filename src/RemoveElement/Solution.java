package RemoveElement;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[] removeElement(int[] A, int elem) {
        List<Integer> list = new ArrayList<Integer>();
        int len = A.length;
        for(int i=0;i<len ;i++){
        	if(elem != A[i]){
        		list.add(A[i]);
        	}
        }
        
        int[] a = convertToInt(list);
        
		return a;
    }
	
	public int[] convertToInt(List<Integer> list){
		int len = list.size();
		int[] a =  new int[len];
		for(int i=0;i<len;i++){
			a[i] = list.get(i);
		}
		
		return a;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = {1,2,2,3,4};
		Solution s = new Solution();
		int[] a = s.removeElement(A, 2);
		System.out.println(a.length);
	}

}

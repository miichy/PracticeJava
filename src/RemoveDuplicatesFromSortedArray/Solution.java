package RemoveDuplicatesFromSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	/**
	 * Given input array A = [1,1,2],
	 * Your function should return length = 2, and A is now [1,2].
	 * 
	 * 
	 * @param A
	 * @return
	 */
	public int removeDuplicates(int[] A) {
		List<Integer>  aa = new ArrayList<Integer>();
		int len = A.length;
		
		//aa.add(A[0]);
		
		for(int i=0 ;i < A.length ; i++){
			//check   A[i]  is in newA[] or not
			if(!check(aa, A[i])){
				aa.add(A[i]);
			}
			// in  :   nothing todo
			// not in  newA :  add to newA
		}
		
        return aa.size();
    }
	
	public int[] addElement(int[] a, int e){
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}
	
	public boolean check(List<Integer> a ,int e){
		return a.contains(e);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = {-999,-999,-998,-998,-997,-997,-996,-996,-995,-995,-994,-994,-993,-993,-992,-992,-991,-991,-990,-990,-989,-989,-988,-988,-987,-987,-986,-986,-985,-985,-984,-984,-983,-983,-982,-982,-981,-981,-980,-980,-979,-979,-978,-978,-977,-977,-976,-976,};
		
		if(A.length <= 0){
			System.out.println("Wrong int[] A!");
			System.exit(0);
		}
		
		Solution s = new Solution();
		System.out.println(s.removeDuplicates(A));
	}

}

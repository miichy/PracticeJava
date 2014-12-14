package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	/**
	 *      [1],
 	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	 numRows = 5;
	 * @param numRows
	 * @return
	 */
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>>  triangle = new ArrayList<List<Integer>>();
    	List<Integer> tmpList = new ArrayList<Integer>();
    	
    	if (numRows <= 0){
    		return null;
    	}
    	
    	if (numRows == 1 ){
    		tmpList.add(1);
    	}
    	
    	return triangle;
    }
    
    public int[][] generateHelper(int numRows){
    	List<List<Integer>>  triangle = new ArrayList<List<Integer>>();
    	int[][] a = new int[numRows][numRows] ;
    	for(int i=0;i < numRows; i++){
    		List<Integer> tmpList = new ArrayList<Integer>();
    		for(int j = 0;j <= i;j++){
    			a[i][j] = h(i,j);
    			tmpList.add(a[i][j]);
    		}
    		triangle.add(tmpList);
    	}
    	
    	return a;
    }
    
    public int h(int i,int j){
    	if( i < j){
    		return 0;
    	}
    	if(i == j || j == 0 ){
    		return 1;
    	}else if(i == 0 && j==0){
    		return 1;
    	}else{
    		return h(i-1,j) + h(i -1,j-1);
    	}
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s =new Solution();
		System.out.println(s.generateHelper(30));

	}

}

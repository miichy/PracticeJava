package PascalsTriangleII119;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.getRow(1);
	}
	
    public ArrayList<Integer> getRow(int rowIndex) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 1);
        if(rowIndex == 0){
        	return list;
        }
        list.add(list.size() , 1);
        
        while(list.size() < rowIndex + 1){
        	for(int i = 0;i < list.size() - 1;i++){
        		list.set(i, list.get(i) + list.get(i + 1));
        	}
        	list.add(0, 1);
        }
        
        for(Iterator iter = list.iterator() ;iter.hasNext();){
        	System.out.println(iter.next());
        }
        
    	return list;
    }

}

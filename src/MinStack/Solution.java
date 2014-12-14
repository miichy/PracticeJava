package MinStack;

import java.util.ArrayList;
import java.util.List;

import IntersectionofTwoLinkedLists.ListNode;

public class Solution {

    List<Integer> l = new ArrayList<Integer>();
	
    public void push(int x) {
        l.add(x);
    }

    public void pop() {
        if(l == null){
        	System.out.println("Empty!");
        }else{
        	l.get(l.size() - 1);
        	l.remove(l.size() - 1);
        }
    }

    public int top() {
        return l.get(l.size() - 1);
    }

    public int getMin() {
        int tmp = l.get(0);
        
        for(int i=1;i < l.size();i++){
        	if (l.get(i) <= tmp){
        		tmp = l.get(i);
        	}
        }
        
        return tmp;
        
    }

}

package IntersectionofTwoLinkedLists;

import java.util.Stack;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	
    	if(headA == null || headB ==null){
    		return null;
    	}
        
    	int len = compareLength(headA, headB);//    headA.length - headB.length
    	
    	if(len>0){
    		for(int i = 0;i < len; i++){
    			headA = headA.next;
    		}
    	}else{
    		int i = len >> 31;
    		len = ((len ^ i) - i);
    		
    		for(i = 0;i<len ; i++){
    			headB = headB.next;
    		}
    	}
    	
    	for(;;){
    		if(headA != headB){
    			if(headA.next != null){
    				headA = headA.next;
    				headB = headB.next;
    			}else{
    				return null;
    			}
    		}else{
    			return headA;
    		}
    	}
    	
    }
    
    public int compareLength(ListNode headA,ListNode headB){
    	
    	ListNode l = new ListNode(1);
    	l.next =  headA;
    	
    	for(;;){
    		if(l.next != null){
    			l.next = l.next.next;
    			l.val++;
    		}else{
    			break;
    		}
    	}
    	
    	l.next = headB;
    	l.val--;
    	
    	for(;;){
    		if(l.next != null){
    			l.next = l.next.next;
    			l.val--;
    		}else{
    			break;
    		}
    	}
    	
       return l.val;
    	
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		ListNode headB = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		headA.next = l3;
		headB.next = l2;
		l2.next = l3;
		
		Solution s = new Solution();
		ListNode re = s.getIntersectionNode(headA, headB);
		System.out.println(re.val);

	}

}

package AddTwoNumbers;

import java.util.Scanner;

import IntersectionofTwoLinkedLists.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode cur = null;
    	ListNode result = null;
    	if(l1 != null && l2 != null){
    		ListNode cur1 = l1;
    		ListNode cur2 = l2;
    		int f = 0;
    		
    		while(cur1 != null || cur2 != null){
    			int res = 0;
    			if(cur1 != null){
    				res += cur1.val;
    				cur1 = cur1.next;
    			}
    			if(cur2 != null){
    				res += cur2.val;
    				cur2 = cur2.next;
    			}    			
    			if(f != 0){
    				res = f + res;
    			}
    			f = res / 10;
    			res = res % 10;
    			
    			if(result == null){
    			    result = new ListNode(res);
    			    cur = result;
    			}else{
    			    result.next = new ListNode(res);
    			    result = result.next;
    			}
//    			result = result.next;
    		}
    		
    		if(f != 0){ 
    			result.next = new ListNode(f);
    		}
    	}
        return cur;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
//		ListNode l1 = new ListNode(9);
//		ListNode l2 = new ListNode(3);
//		ListNode l3 = new ListNode(1);
//		head1.next = l1;
//		l1.next = l2;
//		l2.next = l3;
		ListNode head2 = new ListNode(9);
		ListNode l4 = new ListNode(9);
//		ListNode l5 =  new ListNode(3);
//		ListNode l6 = new ListNode(1);
		head2.next = l4;
//		l4.next = l5;
//		l5.next = l6;
		Solution s = new Solution();
		ListNode re = s.addTwoNumbers(head1, head2);
		while(re != null){
			System.out.println(re.val);
			re = re.next;
		}

	}

}

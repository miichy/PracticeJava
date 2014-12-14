package AddTwoNumbers;

import IntersectionofTwoLinkedLists.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode cur = new ListNode(0);
    	ListNode result = cur;
    	boolean flag = false;
    	if(l1 != null && l2 != null){
    		ListNode cur1 = l1;
    		ListNode cur2 = l2;
    		
    		while(cur1 != null || cur2 != null){
    			result.val += flag ? 1 : 0;
    			
    			if(cur1 != null){
    				result.val += cur1.val;
    				cur1 = cur1.next;
    			}
    			if(cur2 != null){
    				result.val += cur2.val;
    				cur2 = cur2.next;
    			}
    			
    			if(result.val >= 10){
    				flag = true;
    			}else{
    				flag = false;
    			}
    			result.val = result.val % 10;
    			result.next = new ListNode(0);
    			result = result.next;
    		}
    		
    		if(flag){
    			result.val = 1;
    		}else{
    			result.next = null;
    		}
    	}
        return cur;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		l1.next = new ListNode(9);
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(3);
		Solution s = new Solution();
		ListNode re = s.addTwoNumbers(l1, l2);
		while(re != null){
			System.out.println(re.val);
			re = re.next;
		}

	}

}

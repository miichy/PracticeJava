package RemoveDuplicatesfromSortedListII;

import LinkedListCycle.ListNode;

public class Solution {

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(1);
		ListNode three = new ListNode(2);
		ListNode four = new ListNode(2);
		ListNode five = new ListNode(3);
		ListNode six = new ListNode(3);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		
		Solution s = new Solution();
		s.deleteDuplicates(one);

	}
	
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode t = new ListNode(0);
    	t.next = head;
    	
    	ListNode p = t;
    	while(p.next != null && p.next.next != null){
    		if(p.next.val == p.next.next.val){
    			int dup = p.next.val;
    			while(p.next != null && p.next.val == dup){
    				p.next = p.next.next;
    			}
    		}else{
    			p = p.next;
    		}
    	}
    	
    	return t.next;
    }

}

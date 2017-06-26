package PalindromeLinkedList234;

import LinkedListCycle.ListNode;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Hello");

	}

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head,slow = head;
        while(fast != null && fast.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        }
        if(fast != null){
        	slow = slow.next;
        }
        ListNode right = reverse(slow);
        ListNode left = head;
        boolean res = true;
        while(right != null){
        	if(left.val != right.val){
        		res = false;
        		break;
        	}
        	left = left.next;
        	right = right.next;
        }
        
        reverse(right);
        return res;
        
    }
    
    public ListNode reverse(ListNode head){
    	ListNode pre = null;
    	while(head != null){
    		ListNode next = head.next;
    		head.next = pre;
    		pre = head;
    		head = next;
    	}
    	return pre;
    }
}

package PartitionList;

import LinkedListCycle.ListNode;

public class Solution {

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(4);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(2);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(2);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		
		ListNode  ret = partition(one, 3);
		while(ret != null){
			System.out.println(ret.val);
			ret = ret.next;
		}

	}

	public static  ListNode partition(ListNode head,int x){
		if(head == null || head.next == null)
			return head;
		ListNode h1 = null;
		ListNode c1 = null;
		
		ListNode h2 = null;
		ListNode c2 = null;
		
		ListNode current = head;
		ListNode next = null;
		
		while(current != null){
			next = current.next;
			if(current.val  < x){
				if(h1 == null){
					h1 = current;
					c1 = current;
				}else{
					c1.next = current;
					c1 = c1.next;
				}
				c1.next = null;
			}else{
				if(h2 == null){
					h2 = current;
					c2 = current;
				}else{
					c2.next = current;
					c2 = c2.next;
				}
				c2.next = null;
			}
			current = next;
		}
		
		if(h1 == null)
			return h2;
		c1.next = h2;
		
		return h1;
	}
}

package RemoveNthNodeFromEndofList;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * 
 * 
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode cur = head, prev = head;
        while(n-- > 0) {
            cur = cur.next;
        }
        if (cur == null) 
            return head.next;
        while (cur.next != null) {
            cur = cur.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
    
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode sed =new ListNode(2);
		ListNode thir =new ListNode(3);
		ListNode four =new ListNode(4);
		head.next = sed;
		sed.next = thir;
		thir.next = four;
		
		ListNode cur = head;
		while(cur.next != null){
			System.out.println(cur.val);
			cur = cur.next;
		}

		Solution s = new Solution();
		System.out.println(s.removeNthFromEnd(head, 2));

	}
}

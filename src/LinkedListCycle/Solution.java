package LinkedListCycle;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean hasCycle(ListNode head) {
		ListNode stepTwo = head;
		ListNode stepOne = head;
		
		while(true){
			
			if((stepTwo == null) || (stepTwo.next == null)){
				return false;
			}
			
			stepTwo = stepTwo.next.next;
			stepOne = stepOne.next;
			
			if(stepTwo == stepOne)
				return true;//break;
			
		}
		
//		stepOne = head;
//		while(stepOne != stepTwo){
//			stepOne = stepOne.next;
//			stepTwo = stepTwo.next;
//		}
//		
//		return stepOne;
		
    }

}

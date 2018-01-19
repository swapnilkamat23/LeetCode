/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddtwoNumbersLinkedLists {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0; 
        int carry=0;
        ListNode head = new ListNode(-1);
        ListNode current = head;
        // loop till both the lists are traversed
        while(l1!=null || l2!=null){
            sum=0;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode newNode = new ListNode((sum+carry)%10);
            carry = (sum+carry)/10;
            if(head.val==-1){
                head = newNode;
                current = newNode;
            }
            else{
                current.next = newNode;
                current = current.next;
            }
        }
        // add carry to the result after both the lists are traversed
        if(carry!=0){
            ListNode remCarry = new ListNode(carry);
            current.next = remCarry;
        }
        return head;
    }
	
}

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
 
 1
 1 2 3 
 */


public class Solution {
    public ListNode swapPairs(ListNode head) {
        
        
        // 1 2 3 4
        //dummy
        // prev catch coupe
        //update prev
        
        //5.1
        if(head == null)return null;
        
        //5.2 dummy
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        //5.2.a so many nodes ; couple before ,couple next
        ListNode prev = dummy;
        ListNode curr = prev.next;
        ListNode currN = curr.next;
        ListNode currN2 =null ;//may be exist
        
        //reverse couple ,update prev
        while( curr!=null && currN!=null) //must couple exist, or else not reverse
        {
            //back it up , bakup 2 
            currN = curr.next;
            currN2 = currN.next;
            
            currN.next = curr; //the second reverse .. name no diif
            curr = currN2;// ???? very important 
            
            //update
            prev.next = currN ;//link head
            
            prev = currN2; 
            
        }
        //
        
        //4.4 return dummy next
        return dummy.next;
    }
}














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
        
        //4.1 dummy
        LinkNode dummy = new LinkNode(0);
        dummy.next = head;
        LinkNode prev = dummy;
        LinkNode curr = prev.next;
        LinkNode next = curr.next;
        
        //reverse couple ,update prev
        while( curr!=null && next!=null) //must couple exist, or else not reverse
        {
            
           // next = curr.next;
            curr.next = prev;
            
            prev.next = next ;//link head
            
            prev = 
            
            
            //bad
        }
        //
        
        //4.4 return dummy next
        
    }
}














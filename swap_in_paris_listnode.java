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
            if(curr.next !=null)
            	currN = curr.next;
            else
                break;
            
            
            currN2 = currN.next;
       
            
            currN.next = curr; //the second reverse .. name no diif
            
            curr.next = currN2 ; //三个指针，难度强于普通翻转3倍
                
            //update
            prev.next = currN ;//link head
            
            prev = curr; //！！ update here, and it should move 1?
            
            //
            curr = currN2;// ！！：其实经常这么搭配啊
            
        }
        //
        
        //4.4 return dummy next
        return dummy.next;
    }
}

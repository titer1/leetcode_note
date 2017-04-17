/**
remove Duplicates from Sorted List II 1->2->3->3->4->4->5 return  1->2->5 

        //ListNode dummy(0);//static class ??
        ListNode dummy = new ListNode(0);
  
       dummy init 
       return dummy son
       
     if( move.next.val == move.next.next.val)
      //son grandson compare ...
                
                
        
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null)
            return null;
        //deummy node
        //ListNode dummy(0);//static class ??
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode move = dummy; 
        /*
        while couple exist
        	check son couple equal 
            if equal 
            	jump;
            else
            	jump
        */
        //return dummy next
        int tempValue=0;
        while( move.next !=null && move.next.next !=null )
        {

            if( move.next.val == move.next.next.val)
                //son grandson
            {
                tempValue = move.next.val;
                while( move.next!=null&&
                     move.next.val == tempValue)
                {
                    //delete node in c++
                    move.next = move.next.next; //until find a different one;
                    
                }
            }
            else
            {
                move = move.next ; //give son;
            }
                
                
        }
        

        return dummy.next;
        
    }
}

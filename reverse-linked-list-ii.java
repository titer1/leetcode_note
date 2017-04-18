/**
原题 没有第一代版本的reverse
thanks mobi, 通过了，

- dummy node
- find m -1 node ,save preM , M
- reverse using traditional
- link 2 sublist


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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head ;
        ListNode move = dummy;
        // [1 ,m)
        for( int i = 1 ; i< m ;i++)
            { 
        	if(move.next == null)
                return null; //invalid m
            move = move.next;
        }
        
       //5.2 save preM, m , set curr , next
        ListNode  preM = move;
        ListNode M = move.next;
        
        ListNode curr = M;
        ListNode next = curr.next;
        ListNode nextNext = null;
        
        //5.3          //reverse
        for(int i = m ; i< n ; i++)//to know n
            {
            if(next == null ) 
                break; //66 add here
            	nextNext = next.next;
            	next.next = curr;
            	curr = next ;
            	next = nextNext;
        }
        
        //5.4 link list
        	preM.next =  curr;
        	M.next = next;
        


        // (n , +oo)
        
        //5.5 return dummy next
        	return dummy.next;
   
    }
    
    /*
Given1->2->3->4->5->NULL, m = 2 and n = 4, 

return1->4->3->2->5->NULL. 

Note:
 Given m, n satisfy the following condition:
 1 ≤ m ≤ n ≤ length of list. 

    */
}

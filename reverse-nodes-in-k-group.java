/*
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list. 

If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is. 

You may not alter the values in the nodes, only nodes itself may be changed. 

Only constant memory is allowed. 

For example,
 Given this linked list:1->2->3->4->5 

For k = 2, you should return:2->1->4->3->5 

For k = 3, you should return:3->2->1->4->5 



*/

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
 */

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
 */


public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int cnt = 0 ;

        //if (k == 0)
        if( k<= 1 ||(head == null) || (head.next == null))
            return head;
 
        //node 2 only
        ListNode pre = head ;
        ListNode now = head.next;
        ListNode more = now.next;
        ListNode oldH = head;
        
        
        if(more == null)//2 node
        {
            //java.lang.System.out.printfln(pre.val+" "+now.val);
            if(k == 2)
            {
                now.next = pre;
                head = now;
                return head;
            }
            else
                return null;//add it here later
            
        }
        
        /*
        while(more != null)
         {
            
            more = now.next;
            now.next = pre;
            pre = now;//change pre
            now = more;//change now
            
            cnt ++ ;
            
            if(cnt == k)
            {
                oldH.next = now;
                break;
            }
            
        }
        
        */
        return pre;
        //{1,2} 2
        
    }
}

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *deleteDuplicates(ListNode *head) {
        
        if(head == NULL)
            return NULL;
        //dummy init by new //dummy init by new
        ListNode dummy = ListNode(0);
        //dummy = head;
        ListNode * move = &dummy;
        dummy.next = head ;            //！！！！ do not forget
        
        
        int tmp = 0;
        //iterate son and grandson | noraml update myself
        while( move->next != NULL &&
               move->next->next != NULL)//only son ,that is ok also
        {
            
            if( move->next->val == move->next->next->val)
                {
                
                tmp = move->next->val;
                while(move->next != NULL && 
                      tmp == move->next->val)
                {
                    
                    move->next =move->next->next;
                }
            }
            else
            {   
                move = move->next;
            }
        }
        

        
        //return dummy son
        
        return dummy.next;
    }
};

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> arraylist = new ArrayList(); 
        
        if (head == null || head.next == null){
            return false; 
        }
        
        while(true){          
            arraylist.add(head);
            head = head.next;
            
            for(int i = 0 ; i < arraylist.size(); i++){
                if (arraylist.get(i) == head){
                    return true; 
                } 
            } 
            if (head.next == null){
                break; 
            }
        }
        return false; 
    }
}
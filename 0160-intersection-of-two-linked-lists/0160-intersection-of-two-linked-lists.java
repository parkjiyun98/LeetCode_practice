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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        HashMap<ListNode,ListNode> map = new HashMap<>();
        while(true){
            map.put(headA,headA.next);
            if(headA.next == null){
                break;
            }
            headA = headA.next;

        }
        while(true){
            if(map.containsKey(headB)) {return headB;}
                if(headB.next == null){
                break;
                }
            headB = headB.next;


        }
        return null;
        
    }
}
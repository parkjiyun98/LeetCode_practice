/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode result = new ListNode();
        ListNode previous = result;
        ListNode current = head;
        ListNode next;
        while (current != null) {
          next = current.next;
          while (previous.next != null && previous.next.val < current.val) {
            previous = previous.next;
          }
          current.next = previous.next;
          previous.next = current;
          previous = result;
          current = next;
        }
        return result.next;
        
    }
}
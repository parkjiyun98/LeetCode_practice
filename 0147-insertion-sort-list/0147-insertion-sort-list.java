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
        /*
        if(head == null) return head;
        ListNode current = head.next;
        ListNode pre = head;
        while(current !=null){
            if(current.val >= pre.val){
                current = current.next;
                pre = pre.next;
            }
            else{
                pre.next = current.next;
                if(current.val <= head.val){ 
                    current.next = head;
                    head = current;
                }
                else{
                    ListNode search = head;
                    while(search.next != null && search.next.val < current.val){
                        search = search.next;
                    }
                    ListNode tmp = search.next;
                    search.next = current;
                    current.next = tmp;
                }
                current = pre.next;
            }
        }
        return head;
        */
        
            if(head == null || head.next == null) return head;
            List<Integer> list = new LinkedList<>();
            ListNode temp = head;
            while(temp != null){
                list.add(temp.val);
                temp = temp.next;
            }
            int [] arr = list.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(arr);
            temp = head;
            int i = 0;
            while(temp != null){
                temp.val = arr[i];
                temp = temp.next;
                i++;
            }
            return head;
        }
}
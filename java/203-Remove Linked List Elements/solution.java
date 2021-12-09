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
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        if(head == null){
            return head;
        }
        
        while(cur != null){
            if(cur.val == val ){
            head = cur.next;
            cur = head;
        }else{
            if(cur.next != null && cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
            }
        }
        return head;
    }
}
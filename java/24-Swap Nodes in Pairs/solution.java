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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode cur = temp;
        while(cur.next != null && cur.next.next != null){
            swap(cur);
            cur = cur.next.next;
        }
        return temp.next;
    }
    
    public void swap(ListNode x){
        ListNode temp = x.next;
        x.next = temp.next;
        temp.next = temp.next.next;
        x.next.next = temp;
    }
}
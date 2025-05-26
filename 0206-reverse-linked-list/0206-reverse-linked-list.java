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
    public ListNode reverseList(ListNode head) {
        ListNode prest=head;
        ListNode prev=null;
       
        while(prest!=null){
             ListNode nex=prest.next;
            prest.next=prev;
            prev=prest;
            prest=nex;
            if(nex!=null){
            nex=nex.next;
            }
        }
        return prev;
    }
}
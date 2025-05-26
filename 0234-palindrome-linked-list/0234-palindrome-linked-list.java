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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
         ListNode mid=middleslf(head);
        ListNode secondhead=reverse(mid);
        ListNode reverse=secondhead;
        boolean ispali=true;
        while (secondhead!=null){
            if(head.val!= secondhead.val){
                ispali=false;
                break;
            }
            head=head.next;
            secondhead=secondhead.next;
        }
        reverse(reverse);
        return ispali;
    }
        static ListNode reverse(ListNode node){
        ListNode prev=null;
        ListNode prest=node;
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
    static ListNode middleslf(ListNode node){
       ListNode slow=node;
        ListNode  fast=node;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }
}
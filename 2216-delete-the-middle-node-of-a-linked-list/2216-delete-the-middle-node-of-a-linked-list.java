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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
         int index=getsize(head);
        ListNode res= head;
        ListNode dum=null;
        for (int i = 0; i <index/2 ; i++) {
            dum=res;
            res=res.next;
        }
       
        dum.next=res.next;
        return head;
    }
    static int getsize(ListNode s1){
        ListNode temp= s1;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
}
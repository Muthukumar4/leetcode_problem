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
    public ListNode middleNode(ListNode head) {
         int index=getsize(head);
        ListNode res= head;
        for (int i = 0; i <index/2 ; i++) {
            res=res.next;
        }
        return res;
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
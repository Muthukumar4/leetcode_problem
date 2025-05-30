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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode();
        ListNode tails=ans;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                tails.next=list1;
                list1=list1.next;
                tails=tails.next;

            }
            else{
                tails.next=list2;
                list2=list2.next;
                tails=tails.next;
            }
        
        
        }
        tails.next=(list1!=null)?list1:list2;
        return ans.next;
    }
}
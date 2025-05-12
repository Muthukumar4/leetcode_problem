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
    public ListNode addTwoNumbers(ListNode list, ListNode list1) {
         ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        int sum;
        while(list!=null||list1!=null){
            sum=0;
            if(list!=null){
                sum+=list.val;
                list=list.next;
            }
            if(list1!=null){
                sum+=list1.val;
                list1=list1.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;

        }
        if(carry>0){
            ListNode node=new ListNode(carry);
            temp.next=node;
        }
        return dummy.next;
    }
}
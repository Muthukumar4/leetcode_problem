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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head; 
      }
      ArrayList<Integer> list=new ArrayList<>();

      ListNode temp=head;
      while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
      }
      int l=left-1;
      int r=right-1;
      while(l<r){
        int tep=list.get(l);
        list.set(l,list.get(r));
        list.set(r,tep);
        l++;
        r--;
      }
      temp=head;
      for(int num:list){
        temp.val=num;
        temp=temp.next;
      }
      return head;
    
       
       
    }

}
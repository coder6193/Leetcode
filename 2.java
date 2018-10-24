/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //non-negative
        
        ListNode dummy= new ListNode(-1);
        
        ListNode node1=dummy;
        
        int rem=0;
        while(l1!=null || l2!=null || rem!=0){
            int val1=0;
            int val2=0;
            
            if(l1!=null){
                val1=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null){
                val2=l2.val;
                l2=l2.next;
            }
            
            node1.next=new ListNode((val1+val2+rem)%10);
            node1=node1.next;
            
            rem=(val1+val2+rem)/10;
            
        }
        
        return dummy.next;
    }
}

/*
 Questions to ask:
 1.
 Mistakes done:
 1. Memory limit exceeded because i had exchanged remainder and dividend values.
 
 Other optimal solutions:
 All top answers followed the same approach
 
 */

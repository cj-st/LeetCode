/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.


*/

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
         Boolean carry = false;
         ListNode head = new ListNode(0);
         ListNode result = head ;
        
        while (l1 != null || l2 != null|| carry) {
            
            
            int r = 0, tmp = 0;
            if (l1 != null) {
                r = r + l1.val;
                l1 = l1.next;
            } 
            if (l2 != null ) {
                r = r + l2.val;
                l2 = l2.next;
            } 
            
            if (r >= 10) {
                if (carry) {
                     tmp = r - 10 + 1;
                } else {
                     tmp= r  -10;
                }
                carry = true;
            } else {
                if (carry) {
                    tmp = r + 1; 
                    
                } else {
                    tmp= r;
                }
                carry = false;
                
            }
            
            if (tmp == 10) {
                result.val = tmp - 10;
                carry = true;
            } else {
                 result.val = tmp;
            }
           
            //System.out.println(r);
            if ((l1 != null ) ||  (l2 != null ) || carry ){
                  
                    result.next = new ListNode(0);
                    result = result.next;
                }
            
            
        }
       
        
        return head;
        
        
    }
} 

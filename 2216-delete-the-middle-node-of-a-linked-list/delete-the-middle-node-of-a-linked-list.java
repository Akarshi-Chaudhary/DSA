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


 //mine



// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//        if(head == null || head.next == null)  return null;
//        ListNode fast = head;
//        ListNode slow = head;

//        while(fast!= null && fast.next !=null){
//          fast = fast.next.next;
//          slow = slow.next;
//        } 
//         ListNode mid = slow;
//         ListNode temp = head;
//         while(temp.next != mid){
//             temp = temp.next;
//         }
//         temp.next = temp.next.next;
      
//        return head;
//     }
    
// }


class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        
        prev.next = slow.next;

        return head;
    }
}

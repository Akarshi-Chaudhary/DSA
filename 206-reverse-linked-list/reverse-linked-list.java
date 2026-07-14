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
    //   if(head == null) return null;
    //   ListNode temp = head;
    //   ListNode prev = null;
    //   ListNode front = null;

    //     while(temp != null){
    //         front = temp.next;
    //         temp.next = prev;
    //         prev = temp;
    //         temp = front;
    //     }
    //     return prev;

    if(head == null || head.next == null){
        return head;
    }//base case

    //revrse remain links
    ListNode newhead = reverseList(head.next);

    //revrse curr link
    head.next.next = head;
    head.next = null;

    return newhead;


    }
}
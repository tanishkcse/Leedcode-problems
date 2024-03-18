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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode smallptr = small;
        ListNode largeptr = large;
        
        while (head != null) {
            if (head.val < x) {
                smallptr.next = head;
                smallptr = smallptr.next;
            } else {
                largeptr.next = head;
                largeptr = largeptr.next;
            }
            head = head.next;
        }

        // Joining the small and large partitions
        smallptr.next = large.next;
        // Breaking the link from large partition to avoid cycle
        largeptr.next = null;

        return small.next;
    }
}

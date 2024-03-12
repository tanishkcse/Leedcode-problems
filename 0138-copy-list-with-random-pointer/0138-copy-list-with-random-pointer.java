/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Insert the new node in between the original linkedList
        Node curr = head;
        while (curr != null) {
            Node currNext = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = currNext;
            curr = currNext;
        }

        // Deep copy of random pointer
        curr = head;
        while (curr != null && curr.next != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Separate the linkedList
        Node newHead = head.next;
        Node newCurr = newHead;
        curr = head;
        while (curr != null && newCurr != null) {
            curr.next = (curr.next == null) ? null : curr.next.next;
            newCurr.next = (newCurr.next == null) ? null : newCurr.next.next;
            curr = curr.next;
            newCurr = newCurr.next;
        }
        return newHead;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;     // Previous node, initially null
        ListNode curr = head;     // Current node, starts at the head

        // Traverse the list
        while (curr != null) {
            ListNode nextNode = curr.next;  // Temporarily store the next node
            curr.next = prev;               // Reverse the current node's pointer
            prev = curr;                    // Move prev and curr one step forward
            curr = nextNode;
        }

        // At the end, prev will be the new head of the reversed list
        return prev;
    }
}
public class approach2 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        // Time Complexity: O(n)
        // - We traverse the list at most twice
        // Space Complexity: O(1)
        // - No extra space is used (only pointers)

        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;          // moves 1 step
            fast = fast.next.next;     // moves 2 steps

            if (slow == fast) {

                // Step 2: Find start of cycle
                ListNode ptr = head;

                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }

                return ptr; // cycle starting node
            }
        }

        return null; // no cycle
    }
}

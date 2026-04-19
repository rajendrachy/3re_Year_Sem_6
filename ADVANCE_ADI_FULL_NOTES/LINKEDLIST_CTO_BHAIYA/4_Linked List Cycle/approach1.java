import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode current = head;

        while (current != null) {
            // if already visited → cycle
            if (set.contains(current)) {
                return true;
            }

            set.add(current);
            current = current.next;
        }

        return false; // no cycle
    }
}


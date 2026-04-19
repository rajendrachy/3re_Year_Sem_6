import java.util.HashSet;
import java.util.Set;

public class approach1 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {

            if (set.contains(curr)) {
                return curr; // start of cycle
            }

            set.add(curr);
            curr = curr.next;
        }

        return null; // no cycle
    }
}



// Time Complexity
// ⏱️ O(n)

// S.P -> O(n)


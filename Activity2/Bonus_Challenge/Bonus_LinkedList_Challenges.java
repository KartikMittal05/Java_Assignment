public class Bonus_LinkedList_Challenges {

    // Detect loop using Floyd's Algorithm
    static boolean detectLoop(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    // Merge two sorted linked lists
    static Node mergeSorted(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data) {
            a.next = mergeSorted(a.next, b);
            return a;
        } else {
            b.next = mergeSorted(a, b.next);
            return b;
        }
    }

    // Remove duplicates from sorted list
    static void removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
    }
}

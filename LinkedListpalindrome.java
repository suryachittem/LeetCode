
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListpalindrome {

    public ListNode findmiddle(ListNode head) {
        ListNode turtle = head;
        ListNode hare = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode middle = findmiddle(head);
        ListNode secondhalf = reverse(middle.next);
        ListNode firsthalf = head;
        while (secondhalf != null) {
            if (secondhalf.val != firsthalf.val) {
                return false;
            }
            secondhalf = secondhalf.next;
            firsthalf = firsthalf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        LinkedListpalindrome p = new LinkedListpalindrome();
        boolean result = p.isPalindrome(head);
        System.out.println("Is palindrome: " + result);
    }
}

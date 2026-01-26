import java.util.Stack;

public class CheckPLindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // using stack
    public static boolean isPalindrome(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.data != st.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    // using slow and fats pointer
    public static boolean isPalindromeOptimal(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        // finding the middle node
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reversing the half list
        Node secondHead = reverse(slow.next);

        Node first = head;
        Node second = secondHead;

        while (second!= null) {
            if(first.data != second.data){
                reverse(secondHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }
        reverse(secondHead);
        return true;
    }

    public static Node reverse(Node head) {

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;

        temp.next = new Node(2);
        temp = temp.next;

        temp.next = new Node(3);
        temp = temp.next;

        temp.next = new Node(3);
        temp = temp.next;

        temp.next = new Node(2);
        temp = temp.next;

        temp.next = new Node(1);
        temp = temp.next;

        System.out.println(isPalindromeOptimal(head));
    }
}

// tc = 0(n)
// sc = 0(n) for using stack


//for optimal -> tc = 0(n) and sc= 0(1)
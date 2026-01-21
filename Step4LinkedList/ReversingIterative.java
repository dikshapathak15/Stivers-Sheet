import java.util.Stack;

public class ReversingIterative {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseIteStack(Node head) {

        Stack<Integer> st = new Stack<>();

        Node temp = head;

        // step 1 - pushing list into the stack
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        // replace data from the stack value
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node reverseStandard(Node head) {
        Node prev = null;
        Node temp = head;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;

        temp.next = new Node(2);
        temp = temp.next;

        temp.next = new Node(3);
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(5);
        temp = temp.next;

        head = reverseStandard(head);
        printList(head);
    }
}

// tc = 0(n) + 0(n) -> reversing the list twice = 0(2n) = 0(n)
// sc = 0(n) extra stack space

/// standard one -> 0(n)- tc and 0(1) space
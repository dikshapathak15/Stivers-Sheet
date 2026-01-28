public class DeleteMiddle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteNode(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // middle node
        int middle = cnt / 2;

        // find the prev of the middle node

        temp = head;
        for (int i = 0; i < middle - 1; i++) {
            temp = temp.next;
        }

        Node deletedNode = temp.next; // store the deleted node in case we have to return only the deleted node in
                                      // place of whole list

        temp.next = temp.next.next;

        System.out.println("Deleted Node: " + deletedNode.data);

        return head;
    }

    // by using slow and fast pointer
    public static Node deleteMiddleByOpt(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;

    }

    // Helper function to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // here we are creating the linked list manually
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

        temp.next = new Node(6);
        temp = temp.next;

        head = deleteMiddleByOpt(head);

        printList(head);
    }

}


//tc - 0(n) +0(n/2)
//sc = 0(1)


//for optimal one -> tc = 0(n)-> single traversal
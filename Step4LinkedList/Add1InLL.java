public class Add1InLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node add1(Node head) {
        head = reverse(head);

        Node temp = head;
        int carry = 1;

        while (temp != null) {
            temp.data = temp.data + carry;

            if (temp.data < 10) {
                carry = 0;
                break;
            } else {
                temp.data = 0;
                carry = 1;
            }

            if (temp.next == null) {
                break;
            }

            temp = temp.next;
        }
        if (carry == 1) {
            temp.next = new Node(1);
        }
        head = reverse(head);
        return head;
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

    // by optimal or backtracking method
    public static Node add1Backtracking(Node head) {
        int carry = helper(head);

        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    public static int helper(Node head){
        //base case
        if(head == null){
            return 1; //initial carry
        }

        int carry = helper(head.next);

        if (carry == 0) {
            return 0;
        }

        int sum = head.data + carry;

        if (sum < 10) {
            head.data = sum;
            return 0;
        }else{
            head.data = 0;
            return 1;
        }
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
        Node head = new Node(9);
        Node temp = head;

        temp.next = new Node(9);
        temp = temp.next;

        Node third = new Node(9); // store node 3
        temp.next = third;
        temp = temp.next;

        temp.next = new Node(9);
        temp = temp.next;

        head = add1Backtracking(head);

        printList(head);

    }
}

// tc = 0(3n)
// sc = 0(1)

//for backtracking -> tc = 0(n) and sc = 0(n)-> recursion stack
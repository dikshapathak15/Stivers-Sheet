public class ReversingRecursive {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Recursive function to reverse the linked list
    public static Node reverseRecursive(Node head){
        //Base case
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;

    }

    //Helper function to print the list
    public static void printList(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data + " ");
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

        temp.next = new Node(6);
        temp = temp.next;


        head = reverseRecursive(head);
        printList(head);
    }
}

//tc = 0(n)
//sc = 0(n) recursion stack
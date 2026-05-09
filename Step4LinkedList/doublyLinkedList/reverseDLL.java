package doublyLinkedList;

import java.util.Stack;

public class reverseDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node reverseDLL(Node head) { //Brute Force tc = 0(2n) & sc = 0(n)for using stack ds
        Stack<Integer> st = new Stack<>();
        Node temp = head;

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }

        return head;
    }


    public static Node reverseDLLOptimal(Node head){ //optimal tc & sc= 0(n)
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node current = head;

        while (current != null) {
            prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            current = current.prev;
        }
        return prev.prev;
    }


    public static Node printDLL(Node head){
    Node temp = head;
    while (temp!=null) {
        System.out.print(temp.data + " <-> ");
        temp = temp.next;
    }
    System.out.println("null");
    return head;
    }

    public static void main(String[] args) { 
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;

        second.next = third;
        second.prev = head;

        third.next = fourth;
        third.prev = second;

        fourth.prev = third;

        Node reversedHead = reverseDLLOptimal(head);
        printDLL(reversedHead);
    }
}

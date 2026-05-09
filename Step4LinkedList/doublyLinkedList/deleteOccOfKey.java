package doublyLinkedList;

import java.util.Stack;

public class deleteOccOfKey {
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

    public static Node deleteOcc(Node head, int k){ //optimal solution tc = 0(n) & sc = 0(1)
        Node temp = head;
        while (temp != null) {
            if (temp.data == k) {
                if (temp == head) {
                    head = temp.next;
                }
                Node prevNode = temp.prev;
                Node nextNode = temp.next;

                if (nextNode != null ) {
                    nextNode.prev = prevNode;
                }
                if (prevNode != null) {
                    prevNode.next = nextNode;
                }
                temp = nextNode;

            }
            else{
                temp = temp.next;
            }
        }
        return head;

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

        Node reversedHead = deleteOcc(head, 3);
        printDLL(reversedHead);
    }
}



package HardProblemLL;

public class removeDuplicates {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            Node next = null;
            Node prev = null;
        }

        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node removeDuplicates(Node head){  // tc & sc = 0(n)
        Node temp = head;
        while (temp != null && temp.next != null) {
            Node nextNode = temp.next;
            while (nextNode != null && temp.data == nextNode.data) {
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void printLL(Node head){
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

        temp.next = new Node(1);
        temp = temp.next;

        temp.next = new Node(2);
        temp = temp.next;

        temp.next = new Node(3);
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(5);
        temp = temp.next;

        temp.next = new Node(6);  

        Node result = removeDuplicates(head);
        printLL(result);


    }
}

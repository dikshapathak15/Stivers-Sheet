public class DeletingANode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // deleting the first node
    public int deleteFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
        }
        int val = head.data;

        if (head == tail) { // only one node
            head = tail = null;
        } else {
            head = head.next;
        }

        return val;
    }

    public void addFirst(int data) {
        // step - 1 => creating a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step - 2 = > newNode.next = head
        newNode.next = head;

        // step - 3 => head = newNode
        head = newNode;
    }

    // Helper method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeletingANode ll = new DeletingANode();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.deleteFirst();
        ll.printList();
    }
}

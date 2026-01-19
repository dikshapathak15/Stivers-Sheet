public class InsertingANode {
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

    //adding at first
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



    //adding at last
    public void addLast(int data){
        //step- 1 creating a new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    //  Helper method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertingANode ll = new InsertingANode();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.printList();
    }
}

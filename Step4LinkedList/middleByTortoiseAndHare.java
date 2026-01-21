public class middleByTortoiseAndHare {

     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void findMiddle(Node head){
        if(head == null){
            System.out.println("LinkedList is empty");
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.data);
    }

     public static void main(String[] args) {
        //creating and adding node manually
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

        findMiddle(head);

    }
}
//tc = 0(n) -> only one traversal
//sc = 0(1)
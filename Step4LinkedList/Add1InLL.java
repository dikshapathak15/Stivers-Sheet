public class Add1InLL {
     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node add1(Node head){
        head = reverse(head);

        Node temp = head;
        int carry = 1;

        while (temp != null) {
            temp.data = temp.data + carry;

            if (temp.data < 10) {
                carry = 0;
                break;
            }else{
                temp.data = 0;
                carry = 1;
            }

            if (temp.next == null) {
                break;
            }

            temp = temp.next;
        }
       head = reverse(head);
        return head;
    }

    public static Node reverse(Node head){
        Node temp = head;
        Node prev = null;

        while (temp!= null) {
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

        Node third = new Node(3); // store node 3
        temp.next = third;
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(5);
        temp = temp.next;

        temp.next = new Node(6);
        temp = temp.next;

        head = add1(head);

        printList(head);


      }
}

//tc = 0(3n)
//sc = 0(1)
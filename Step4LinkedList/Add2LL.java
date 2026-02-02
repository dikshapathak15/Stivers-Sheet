public class Add2LL {
        public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node add2LL(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        Node dummyNode = new Node(-1);
        Node curr = dummyNode;

        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum = temp1.data + sum;
            }

            if (temp2 != null) {
                sum = temp2.data + sum;
            }

            Node newNode = new Node( sum % 10);
            carry = sum/10;

            curr.next = newNode;
            curr = curr.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;

        }

        if (carry != 0) {
            curr.next = new Node(carry);
        }

        return dummyNode.next;
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
        
    
     // first ll
        Node head1 = new Node(1);
        Node temp = head1;

        temp.next = new Node(2);
        temp = temp.next;

        Node third = new Node(3); // store node 3
        temp.next = third;
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(5);
        temp = temp.next;

        // second ll
        Node head2 = new Node(7);
        temp = head2;

        temp.next = new Node(8);
        temp = temp.next;

        Node sumNode = add2LL(head1, head2);

        printList(sumNode);
        

}
}

//tc = 0(max(n,m))
//sc = 0(max(n,m)) -> to print the answer
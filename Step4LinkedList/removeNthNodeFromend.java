public class removeNthNodeFromend {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeNthfromEnd(Node head, int n) {
        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (length == n) {
            return head.next;
        }

        temp = head;
        for (int i = 1; i < length - n; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static Node removeNthFromEndOptimal(Node head, int n){

        Node fast = head;
        Node slow = head;

        //move fast n steps ahead
        for(int i = 0 ; i<n ; i++){
            fast = fast.next;
        }

        //if fast becomes null remove first node
        if(fast == null){
            return head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        //delete the node
        slow.next = slow.next.next;
        return head;
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
        // creating and adding node manually
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

        head = removeNthFromEndOptimal(head, 3);
        printList(head);

    }
}

//tc = 0(n) double traversal
//sc = 0(1)


//for optimal tc = 0(n) - single traversal
//sc = 0(1)
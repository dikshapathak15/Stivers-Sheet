public class Sort012ByOptimal {
       public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node sort012ByOptimal(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;

        Node temp = head;

        //Distribute nodes
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            }else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }else{
                two.next = temp;
                two = temp;
            }

            temp = temp.next;
        }


        //connect links
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;

        one.next = twoDummy.next;
        two.next = null;

        return zeroDummy.next;
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
        // here we are creating the linked list manually
        Node head = new Node(0);
        Node temp = head;

        temp.next = new Node(1);
        temp = temp.next;

        temp.next = new Node(0);
        temp = temp.next;

        temp.next = new Node(1);
        temp = temp.next;

        temp.next = new Node(2);
        temp = temp.next;

        temp.next = new Node(1);
        temp = temp.next;

        head = sort012ByOptimal(head);
        printList(head);
        
          }
}

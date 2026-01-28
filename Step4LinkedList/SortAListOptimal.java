public class SortAListOptimal {
     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
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


    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node middle = findMiddle(head);
        Node rightHead = middle.next;

        middle.next = null;
        Node leftHead = head;

        leftHead = mergeSort(leftHead);
        rightHead = mergeSort(rightHead);

        return merge(leftHead, rightHead);
    }


    public static Node findMiddle(Node head){

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;

      while (l1 != null && l2 != null) {
        if(l1.data <= l2.data){
            temp.next = l1;
            l1 = l1.next;
        }else{
            temp.next = l2;
            l2 = l2.next;
        }

        temp = temp.next;
      }

      if(l1 != null) temp.next = l1;
      if(l2 != null) temp.next = l2;

      return dummy.next;
    }

          public static void main(String[] args) {
        // here we are creating the linked list manually
        Node head = new Node(2);
        Node temp = head;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(7);
        temp = temp.next;

        temp.next = new Node(8);
        temp = temp.next;

        temp.next = new Node(1);
        temp = temp.next;

        temp.next = new Node(3);
        temp = temp.next;

        head = mergeSort(head);
        printList(head);

          }
}

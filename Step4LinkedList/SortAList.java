public class SortAList {

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


    public static int[] linkedListToArray(Node head){
        int size = 0 ;
        Node temp = head;

        while (temp!=null) {
            size++;
            temp = temp.next;
        }

        int arr[] = new int[size];
        temp = head;
        for(int i = 0 ; i < size; i++){
            arr[i] = temp.data;
            temp = temp.next;
        }

        return arr;
    }



    public static Node arrayToLinkedList(int arr[]){
        if(arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1 ; i < arr.length ; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
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

        int arr[] = linkedListToArray(head);

        java.util.Arrays.sort(arr);

        head = arrayToLinkedList(arr);

        printList(head);
      }
}

//tc = 0(n) + 0(n log n) + 0(n)
//sc = 0(n)

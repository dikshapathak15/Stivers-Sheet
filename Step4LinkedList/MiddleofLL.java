public class MiddleofLL {
     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void middlNode(Node head){
        //step 1 - finding the length of ll
        int cnt=0;
        Node temp = head;
        while(temp!= null){
            cnt++;
            temp = temp.next;
        }

        //step 2 - finding the middle index
        int middleIndex = (cnt/2) + 1;

        //step 3 - printing the middle element
        temp = head;
        for(int i = 1 ; i < middleIndex ; i ++){
            temp = temp.next;
        }

        System.out.println("Middle element is : " + temp.data);

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

        middlNode(head);

    }
}

//tc = 0(n) + 0(n/2) = 0(n)
//sc = 0(1)
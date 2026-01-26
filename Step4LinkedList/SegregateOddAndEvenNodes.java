import java.util.ArrayList;

public class SegregateOddAndEvenNodes {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    //using arraylist
    public static Node segOddAndEven(Node head){

        if(head == null || head.next == null){
            return head;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        //moving odd indices to arraylist
        while(temp !=null && temp.next != null){
            arr.add(temp.data);
            temp = temp.next.next;
        }

        if(temp!= null){
            arr.add(temp.data);
        }

        //moving even indices
        temp = head.next;
         while(temp != null && temp.next != null){
            arr.add(temp.data);
            temp = temp.next.next;
        }

        if(temp!= null){
            arr.add(temp.data);
        }


        //rewrite linked list using arraylist
        temp = head;
        int i = 0;

        while (temp!=null) {
            temp.data = arr.get(i++);
            temp = temp.next;
        }

        return head;

    }
    

    //using odd even pointers
    public static Node segOddEvenOptimal(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;  //1->3 (odd pointer is on 1)
            odd = odd.next;   //1->3(odd pointer is on 3)

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
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

        head = segOddEvenOptimal(head);
        printList(head);

        

    }
}


//null pointer exception-> finding next of null, or finding next oof something that doesnot exist so thats why we are checking temp.next!=null
//tc = 0(n)
//sc = 0(n) -> arraylist



//for optimal -> tc = 0(n)
//sc = 0(1)
package doublyLinkedList;

public class deleteHead {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node deletehead(Node head){
        if(head == null || head.next == null) return null;
        Node back = head;
        head = head.next;
        head.prev = null;
        back.next = null;

        return head;
    }

    
    public static Node convertArrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length ; i++){
            Node temp = new Node(arr[i], null, mover);
            mover.next = temp;
            // temp.prev = mover;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrToLL(arr);
        Node deletedHeadList = deletehead(head);
        Node temp = deletedHeadList;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

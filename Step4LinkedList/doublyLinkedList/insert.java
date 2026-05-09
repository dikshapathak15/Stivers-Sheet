package doublyLinkedList;

public class insert {
       public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

     public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, mover);
            mover.next = temp;
            // temp.prev = mover;
            mover = temp;
        }
        return head;
    }

    public static Node insertHead(Node head){
        Node newHead = new Node(0);
        newHead.next = head;
        head.prev = newHead;
        head = newHead;

        return head;
    }

    public static Node insertail(Node head){
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node newTail = new Node(6);
        tail.next = newTail;
        newTail.prev = tail;
        tail = newTail;

        return head;
    }


    public static Node insertbeforeTail(Node head){
        if(head.next == null) return insertHead(head);
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node back = tail.prev;
        Node newNode = new Node(0);

        back.next = newNode;
        tail.prev = newNode;

        newNode.prev = back;
        newNode.next = tail;

        return head;
    }

    public static Node insertBeforeKthEle(Node head, int k){
        if (k == 1) {
            return insertHead(head);
        }

        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }

        Node back = temp.prev;
        Node newNode = new Node(7, temp, back);
        back.next = newNode;
        temp.prev = newNode;

        return head;
    }


        public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convertArrToLL(arr);
        Node newhead = insertBeforeKthEle(head , 4);
        Node temp = newhead;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}

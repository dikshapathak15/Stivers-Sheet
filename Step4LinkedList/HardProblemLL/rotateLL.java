package HardProblemLL;

public class rotateLL {
     public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            Node next = null;
            Node prev = null;
        }

        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

 
    public static Node findNthNode(Node temp, int k){
        int cnt = 1;
        while (temp != null) {
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }

     public static Node rotateLinkedL(Node head, int k){  //tc = 0(2n) & ssc = 0(1)
        if (head == null || k==0) {
            return head;
        }

        Node tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        if (k % len == 0) {
            return head;
        }
        k = k % len;
        tail.next = head;

        Node newLastNode = findNthNode(head, len - k);
        head = newLastNode.next;
        newLastNode.next = null;

        return head;

     }

    public static void printLL(Node head){
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

        temp.next = new Node(3);
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(5);  

        Node result = rotateLinkedL(head,2);
        printLL(result);


    }
}

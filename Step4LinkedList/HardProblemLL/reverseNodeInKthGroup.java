package HardProblemLL;

public class reverseNodeInKthGroup {
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

 
    public static Node getKhNode(Node temp, int k){
        k = k-1;
        while (temp != null && k >0 ) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

     public static Node reverseLL(Node head) {
        Node prev = null;
        Node temp = head;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static Node reverseNode(Node head, int k){ //tc = 0(2n) and sc= 0(1)
        Node temp = head;
        Node prevNode = null;

        while (temp != null) {
            Node kthNode = getKhNode(temp, k);
            if (kthNode == null) {
                if(prevNode != null) prevNode.next = temp;   ///for the last node
                break;
            }
            Node nextNode = kthNode.next;
            kthNode.next = null;

            reverseLL(temp);

            if (temp == head) {
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;

        }
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

        temp.next = new Node(1);
        temp = temp.next;

        temp.next = new Node(2);
        temp = temp.next;

        temp.next = new Node(3);
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(5);
        temp = temp.next;

        temp.next = new Node(6);  

        Node result = reverseNode(head,3);
        printLL(result);


    }
}

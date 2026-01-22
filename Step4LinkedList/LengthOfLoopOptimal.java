import java.util.HashMap;

public class LengthOfLoopOptimal {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int lengthOfLoop(Node head) {
        Node slow = head ;
        Node fast = head;

        while(fast!= null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return findLength(slow, fast);
            }
        }
        return 0;
    }

    public static int findLength(Node slow , Node fast){
        int cnt = 1;
        fast = fast.next;

        while(slow != fast){
            cnt++;
            fast = fast.next;
        }
        return cnt;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;

        temp.next = new Node(2);
        temp = temp.next;

        Node third = new Node(3); // store node 3
        temp.next = third;
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(5);
        temp = temp.next;

        temp.next = new Node(6);
        temp = temp.next;

        temp.next = third;

        System.out.println(lengthOfLoop(head));
    }
}

// tc = 0(n)
// sc = 0(1)

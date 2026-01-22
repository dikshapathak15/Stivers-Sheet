import java.util.HashMap;

public class LengthOfTheLoop {
    

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int lengthOfLoop(Node head){
        HashMap<Node , Integer> map = new HashMap<>();

        int timer = 0 ;
        Node temp = head;

        while (temp != null) {
            if (map.containsKey(temp)) {
                int value = map.get(temp);
                return timer - value;
            }
            map.put(temp, timer);
            timer++;
            temp = temp.next;
        }
        return 0;
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

//tc = 0(n)
//sc = 0(n)

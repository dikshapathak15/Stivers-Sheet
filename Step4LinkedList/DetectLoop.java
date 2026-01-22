import java.util.HashMap;

public class DetectLoop {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean detectLoop(Node head) {
        HashMap<Node, Integer> map = new HashMap<>();

        Node temp = head;

        while (temp != null) {

            // If node already exist in a map -> cycle found
            if (map.containsKey(temp)) {
                return true;
            }

            // mark the node as visited
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
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

        System.out.println(detectLoop(head));
    }
}

//tc = 0(n)
//sc = 0(n) -> due to hashmap
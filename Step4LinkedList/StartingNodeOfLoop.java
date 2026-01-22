import java.util.HashMap;

public class StartingNodeOfLoop {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node startingNodeofCycle(Node head) {
        HashMap<Node, Integer> map = new HashMap<>();

        Node temp = head;

        while (temp != null) {

            // If node already exist in a map -> cycle found
            if (map.containsKey(temp)) {
                return temp;
            }

            // mark the node as visited
            map.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }

    public static Node startingNodeofCycleByOptimal(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
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

        Node startNode = startingNodeofCycleByOptimal(head);

        System.out.println(startNode.data);
    }
}

// tc = 0(n)
// sc = 0(n)

//tc = 0(n) and sc = 0(1) -> floyds
import java.util.HashMap;

public class IntersectionPoint {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node intersectionPointHashing(Node head1 , Node head2) {
        HashMap<Node, Integer> map = new HashMap<>();
        Node temp1 = head1;

        while (temp1 != null) {
            map.put(temp1, 1);
            temp1 = temp1.next;
        }

        Node temp2 = head2;

        while (temp2 != null) {
            if (map.containsKey(temp2)) {
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
    }


    public static void main(String[] args) {

        // common part(intersection)

        Node intersect = new Node(9);
        intersect.next = new Node(10);


        // first ll
        Node head1 = new Node(1);
        Node temp = head1;

        temp.next = new Node(2);
        temp = temp.next;

        Node third = new Node(3); // store node 3
        temp.next = third;
        temp = temp.next;

        temp.next = new Node(4);
        temp = temp.next;

        temp.next = new Node(5);
        temp = temp.next;

        temp.next = intersect;
        temp = temp.next;

        // second ll
        Node head2 = new Node(7);
        temp = head2;

        temp.next = new Node(8);
        temp = temp.next;

        temp.next = intersect;

       Node intersecNode = intersectionPointHashing(head1, head2);

       if (intersecNode != null) {
        System.out.println("Intersection point: " + intersecNode.data);
       }else{
        System.out.println("No intersection found");
       }

    }

}

//tc = 0(n) + 0(m)
//sc = 0(n) -> hahsing
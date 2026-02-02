public class IntPointBtter {
     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node intersectNodeBetter(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        int len1 = 0;
        int len2 = 0;

        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }

        while (temp2!=null) {
            len2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        if (len1 < len2) {
            return collisionPoint(temp1 , temp2 , len2 - len1);
        }else{
            return collisionPoint(temp2 , temp1 , len1 - len2);
        }
    }

    public static Node collisionPoint(Node temp1 , Node temp2 , int d){
        // move temp 2 ahead by d
        while (d>0) {
            temp2 = temp2.next;
            d--;
        }

        //move both pointers together until they meet at intersecting point
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
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

       Node intersecNode = intersectNodeBetter(head1, head2);

       if (intersecNode != null) {
        System.out.println("Intersection point: " + intersecNode.data);
       }else{
        System.out.println("No intersection found");
       }

    }
}

//tc = 0(n1 + n2)
//sc = 0(1)
package doublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class findPairWithGivenSum {

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

    public static List<List<Integer>> findPair(Node head, int k) {  //brute force tc = 0(n^2)nested loop and sc = 0(1)excluding output list

        List<List<Integer>> ans = new ArrayList<>();

        Node temp1 = head;
        while (temp1 != null) {
            Node temp2 = temp1.next;

            while (temp2 != null && (temp1.data + temp2.data <= k)) {

                if (temp1.data + temp2.data == k) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(temp1.data);
                    pair.add(temp2.data);

                    ans.add(pair);
                }

                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return ans;
    }

    public static Node findTail(Node head){
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public static List<List<Integer>> findPairWithSum(Node head, int k){ //optimal tc = 0(2n) & 0(1)
        List<List<Integer>> ans = new ArrayList<>();

        if(head == null){
            return null;
        }
        Node left = head;
        Node right = findTail(head);

        while (left.data < right.data) {
            int sum = left.data + right.data;

            if (sum == k) {
                List<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);

                ans.add(pair);

                left = left.next;
                right = right.prev;
            }else if(sum < k){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;

        second.next = third;
        second.prev = head;

        third.next = fourth;
        third.prev = second;

        fourth.prev = third;

        List<List<Integer>> list = findPairWithSum(head, 3);
        System.out.println(list);
    }
}

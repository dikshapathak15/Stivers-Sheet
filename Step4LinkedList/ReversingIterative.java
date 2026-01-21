import java.util.Stack;

public class ReversingIterative {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverseIteStack(Node head){

        Stack<Integer> st = new Stack<>();

        Node temp = head;

        //step 1 - pushing list into the stack
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        
        //replace data from the stack value
        while (temp!= null) {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next = new Node(3);
        head.next = new Node(4);
        head.next = new Node(5);
        head.next = new Node(6);
    }
}

//tc = 0(n) + 0(n) -> reversing the list twice = 0(2n) = 0(n)
//sc = 0(n) extra stack space
import java.util.Stack;

public class CheckPLindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }      
    }

    public static boolean isPalindrome(Node head){
        Stack<Integer> st = new Stack<>();
        Node temp = head;

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;    
        }

        temp = head;
        while(temp != null){
            if(temp.data != st.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;

        temp.next = new Node(2);
        temp = temp.next;

          temp.next = new Node(3);
        temp = temp.next;

          temp.next = new Node(3);
        temp = temp.next;

          temp.next = new Node(2);
        temp = temp.next;

        
          temp.next = new Node(1);
        temp = temp.next;

        System.out.println(isPalindrome(head));
    }
}

//tc = 0(n)
//sc = 0(n) for using stack 

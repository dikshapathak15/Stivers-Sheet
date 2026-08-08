public class impleStackUsingLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        Node top;
        int size;

        Stack(){
            top = null;
            size = 0;
        }

        public void push(int x){
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            size++;
        }

        public int pop(){
            if(top == null){
                System.out.println("Stack overflow");
                return -1;
            }
            int popedValue = top.data;
            Node temp = top;
            top = top.next;
            temp.next = null;
            size --;

            return popedValue;

        }

        public int top(){
            if(top == null){
                System.out.println("Stack underflow");
                return -1;
            }
            return top.data;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return top == null;
        }
    }
    public static void main(String[] args) {
         Stack s = new Stack();
            s.push(10); 
            s.push(20); 
            s.push(30); 

            System.out.println(s.top());
            System.out.println(s.size());

            s.pop();

            System.out.println(s.top());
            System.out.println(s.size());
            System.out.println(s.isEmpty());
    }
}

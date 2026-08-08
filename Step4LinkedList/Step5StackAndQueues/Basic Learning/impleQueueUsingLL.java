import java.util.Stack;

public class impleQueueUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        Node start, end;
        int size;

        Queue(){
            start = null;
            end = null;
            size = 0;
        }

        public void push(int x){
            Node temp = new Node(x);
            if(start == null){
                start = end = temp;
            }else{
                end.next = temp;
                end = temp;
                size ++;
            }
        }
        public int pop(){
            if(start == null){
                System.out.println("Queue underFlow");
                return -1;
            }
            int value = start.data;
            Node temp = start;
            start = start.next;
            temp.next = null;
            size--;

            return value;
        }

        public int front(){
            if(start == null){
                System.out.println("Queue is empty");
                return -1;
            }
            return start.data;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return start == null;
        }
    }
    public static void main(String[] args) {
         Queue q = new Queue();
            q.push(10);
            q.push(20);
            q.push(30);
            q.push(40);

            q.push(50);
            System.out.println(q.front());
            q.pop();
            System.out.println(q.front());
            q.pop();
            q.pop();
            q.pop();
            System.out.println(q.front());
    }
}

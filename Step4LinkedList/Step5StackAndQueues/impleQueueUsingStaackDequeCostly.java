import java.util.Stack;
class Queue{
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();


    public void push(int x){
       s1.push(x);
    }

    public int pop(){
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (!s2.isEmpty()) {
            return s2.pop();
        }

        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }

        return s2.pop();
    }

    public int peek(){
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (!s2.isEmpty()) {
            return s2.peek();
        }

        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }

        return s2.peek();
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }
}


public class impleQueueUsingStaackDequeCostly {
    public static void main(String[] args) {
            Queue q = new Queue();
            q.push(10);
            q.push(20);
            q.push(30);
            q.push(40);

            q.push(50);
            System.out.println(q.peek());
            q.pop();
            System.out.println(q.peek());
            q.pop();
            q.pop();
            q.pop();
            System.out.println(q.peek());
    }
}



//enqueue costly code tc = 0(2n)-> in pop operation and sc = 0(n+1) auxiliary space used by the data structure is proportional to the no of queue elements
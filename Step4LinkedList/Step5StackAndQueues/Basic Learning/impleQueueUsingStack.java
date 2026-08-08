import java.util.Stack;

class Queue{
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();


    public void push(int x){
        while(!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }

        s1.push(x);

        while(!s2.isEmpty()) {
            s1.push(s2.peek());
            s2.pop();
        }
    }

    public int pop(){
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return s1.pop();
    }

    public int peek(){
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return s1.peek();
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }
}


public class impleQueueUsingStack {
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

//enqueue costly code tc = 0(2n)-> in push operaation and sc = 0(n+1) auxiliary space used by the data structure is proportional to the no of queue elements
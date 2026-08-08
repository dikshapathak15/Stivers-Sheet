import java.util.LinkedList;
import java.util.Queue;


class Stack{
    Queue<Integer> q;

    Stack(){
        q = new LinkedList<>();
    }

    public void push(int x){
        int s = q.size();
        q.offer(x);

        for(int i = 0 ; i < s ; i++){
            q.offer(q.peek());
            q.poll();
        }
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        return q.poll();
    }

    public int top(){
         if(q.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        return q.peek();
    }

    public int size(){
        return q.size();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
}

public class impleStackUsingQueue{
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
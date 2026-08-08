 
 public class ImplementationUsingArrays{
  static class Stack{
    int top  = -1;
    int size = 10;
    int st[] = new int[size];

    void push(int x){
        if(top >= size -1){
            System.out.println("Stack Overflow");
        }else{
            top = top + 1;
            st[top] = x;
        }
    }

    void pop(){
        if (top == -1) {
            System.out.println("Stack Underflow");
        }else{
            top = top - 1;
        }
    }

    int top(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }else{
           return st[top];
        }
    }

    int size(){
        return top + 1;
    }

    boolean isEmpty(){
        return top == -1;
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
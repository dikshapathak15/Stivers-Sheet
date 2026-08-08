import java.util.Stack;

public class getMinStack {
    class Pair {
        int val;
        int min;

        Pair(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
        Stack<Pair> st = new Stack();

        public void push(int val) {
            if (st.isEmpty()) {
                st.push(new Pair(val, val));
            } else {
                int minimun = Math.min(val, st.peek().min);
                st.push(new Pair(val, minimun));
            }
        }

        public void pop() {
            if (!st.isEmpty()) {
                st.pop();
            }
        }

        public int peek() {
            return st.peek().val;
        }

        public int getMin(){
            return st.peek().min;
        }

    
    public static void main(String[] args) {
        getMinStack ms = new getMinStack();
        ms.push(10);
        ms.push(20);
        System.out.println(ms.getMin());
        ms.push(7);
        System.out.println(ms.getMin());
        ms.push(2);
        System.out.println(ms.getMin());
    }

}

//tc = 0(n) AND SPACE COMPLEXITY = 0(2N)

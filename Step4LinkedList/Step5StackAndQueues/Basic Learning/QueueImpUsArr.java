public class QueueImpUsArr {
     static class Queue {
        int[] arr;
        int start, end, currSize, size;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            start = end = -1;
            currSize = 0;
        }

        public void push(int x) {
            if (currSize == size) {
                System.out.println("Queue is Full");
                return;
            }
            if (currSize == 0) {
                start = end = 0;
            } else {
                end = (end + 1) % size;
            }

            arr[end] = x;
            currSize++;
        }

        public int pop() {
            if (currSize == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int ele = arr[start];

            if (currSize == -1) {
                start = end = -1;
            } else {
                start = (start + 1) % size;
            }
            size--;
            return ele;
        }

        public int top() {
            if (currSize == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[start];
        }
    }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.push(10);
            q.push(20);
            q.push(30);
            q.push(40);

            System.out.println(q.top());
        }
    
}

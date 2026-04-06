public class convertArrTLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node convertarrTLL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i ++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int length(Node head){
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static int checkifPresent(Node head, int val){
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) return 1;
            temp = temp.next; 
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertarrTLL(arr);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
        int cnt = length(head);
        System.out.println("Length of the linked list is: " + cnt);

        int result = checkifPresent(head, 7);
        System.out.println(result);
    }
}

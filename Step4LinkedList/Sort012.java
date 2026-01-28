public class Sort012 {

         public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node sort012(Node head){
        int cnt0 = 0 , cnt1 = 0, cnt2 = 0;

        //count the numbers of 0 , 1 and 2
        Node temp = head;
        while (temp!=null) {
            if(temp.data == 0){
                cnt0++;
            }else if(temp.data == 1){
                cnt1++;
            }else{
                cnt2++;
            }

            temp = temp.next;
        }


        //replace the data of LL
        temp = head;
        while (temp != null) {
            if(cnt0 > 0){
                temp.data = 0;
                cnt0 --;
            }else if(cnt1 > 0){
                temp.data = 1;
                cnt1--;
            }else{
                temp.data = 2;
                cnt2--;
            }

            temp = temp.next;
        }

        return head;
    }

     //Helper function to print the list
    public static void printList(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
          public static void main(String[] args) {
        // here we are creating the linked list manually
        Node head = new Node(0);
        Node temp = head;

        temp.next = new Node(1);
        temp = temp.next;

        temp.next = new Node(0);
        temp = temp.next;

        temp.next = new Node(1);
        temp = temp.next;

        temp.next = new Node(2);
        temp = temp.next;

        temp.next = new Node(1);
        temp = temp.next;

        head = sort012(head);
        printList(head);
        
          }
}

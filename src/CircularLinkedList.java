public class CircularLinkedList {
    ListNode last;

    class ListNode{
        int data;
        ListNode next;

        public ListNode(int d) {
            this.data=data;
            this.next =null;
        }
    }

    void CircularLinkedList(){
        this.last = null;
    }

    void createLinkedList(){
        ListNode fis = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode thi = new ListNode(3);
        ListNode fou = new ListNode(4);

        fis.next=sec;
        sec.next=thi;
        thi.next=fou;
        fou.next=fis;

        last = fou;
        ListNode temp = last.next;
        System.out.println(temp.data + " ");
    }

    void print(){

        ListNode temp = last.next;
        while(temp!=last){

            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println(temp.data + " ");
    }
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.createLinkedList();
        cl.print();
    }
}

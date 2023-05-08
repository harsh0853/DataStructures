public class DoublyLinkedList {

    public ListNode head ;
    public ListNode tail;

    static class ListNode{
        int data;
        ListNode next;
        ListNode previous;

        public ListNode(int d) {
            this.data =d;
        }
    }

    void DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }

    boolean isempty(){
        if(head==null && tail==null){
            return true;
        }
        return false;
    }


    void inaertFirst(int d) {
        ListNode temp = new ListNode(d);
        if (isempty()) {
            tail = temp;
        } else {
            head.previous = temp;
        }
        temp.next = head;
        head = temp;
    }

    void print(){
        ListNode temp = head;
        System.out.println("Forwared");
        while(temp!=null){
            System.out.print(temp.data+" -->");
            temp= temp.next;
        }
        System.out.println("null");


        System.out.println("Backward");
        ListNode temp1 = tail;
        while(temp1!=null){
            System.out.print(temp1.data+" -->");
            temp1= temp1.previous;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.inaertFirst(1);
        dl.inaertFirst(6);
        dl.inaertFirst(5);
        dl.print();
    }
}

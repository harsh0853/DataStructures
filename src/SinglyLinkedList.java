 public class SinglyLinkedList {

     static ListNode head;

     static class ListNode {

         int data;
         ListNode next;

         ListNode(int data) {
             this.data = data;
             this.next = null;
         }

         static void printLL() {
             ListNode temp = head;
             while (temp != null) {
                 System.out.print(temp.data + "-->");
                 temp = temp.next;
             }
             System.out.println("null");
         }

         static void length() {
             ListNode temp = head;
             int c = 0;
             while (temp != null) {
                 c++;
                 temp = temp.next;
             }
             System.out.println("Length is : " + c);
         }

         static void insertFirst(int a) {
             ListNode el = new ListNode(a);
             el.next = head;
             head = el;
         }

         static void insertEnd(int b) {
             ListNode el = new ListNode(b);
             ListNode temp = head;
             while (temp.next != null) {
                 temp = temp.next;
             }
             temp.next = el;
             el.next = null;
         }

         static void insertPoint(int c, int pos) {
             ListNode el = new ListNode(c);
             ListNode temp = head;
             int count = 1;
             while (count < pos - 1) {
                 temp = temp.next;
                 count++;
             }
             el.next = temp.next;
             temp.next = el;

         }

         static ListNode deleteFirst() {
             ListNode temp = head;
             head = head.next;
             temp.next = null;
             return temp;

         }

         static void deleteEnd() {
             ListNode previous = null;
             ListNode temp = head;
             while (temp.next != null) {
                 previous = temp;
                 temp = temp.next;
             }
             previous.next = null;
         }

         static void deletionAtpoint( int pos) {

             ListNode temp = head;
             int count = 1;
             while (count < pos - 1) {
                 temp = temp.next;
                 count++;
             }
             temp.next = temp.next.next;
         }

         static boolean detecloop(){
             ListNode temp = head;
             ListNode counter= head;
             while(temp!=null && temp.next!=null){
                 temp=temp.next.next;
                 counter=counter.next;
             }

             // slef test ke krn ulta likha h
             if(counter!=temp)
                return false;
             return true;
         }

         public static void main(String[] args) {
             SinglyLinkedList head = new SinglyLinkedList();
             head.head = new ListNode(1);
             ListNode l = new ListNode(2);
             ListNode ln1 = new ListNode(3);
             ListNode ln2 = new ListNode(4);
             head.head.next = l;
             l.next = ln1;
             ln1.next = ln2;

             ListNode.insertFirst(6);
             ListNode.insertEnd(8);
             ListNode.insertEnd(8);
             ListNode.insertPoint(9, 3);

             ListNode.printLL();
             ListNode.length();
             deletionAtpoint(3);
             //ListNode.deleteEnd();
             //System.out.println(ListNode.deleteFirst().data);
             ListNode.printLL();
             System.out.println(ListNode.detecloop());
         }
     }
 }

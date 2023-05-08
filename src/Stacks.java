import java.util.Scanner;

public class Stacks {
    ListNode top;
    int length = 0;

    static class ListNode{
        int data;
        ListNode next;
        ListNode previous;

        public ListNode(int data) {
            this.data=data;
            this.next = null;
            this.previous=null;
        }


    }

    void push(int d ){
        ListNode el = new ListNode(d);
        top.next=el;
        el.previous = top;
        top=el;
    }

    void print(){
        ListNode temp = top;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.previous;
        }
        System.out.println();
    }

    int pop(){
        ListNode temp = top;
        int d = temp.data;
        temp=top.previous;
        temp.next=null;
        top=temp;
        return d;
    }

    void peek(){
        System.out.println(top.data);
    }

    public static void main(String[] args) {
        System.out.print("Enter data : ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Stacks s = new Stacks();
        s.top=new ListNode(c);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.pop());
        System.out.println(s.pop());

        s.print();

        s.peek();

    }
}

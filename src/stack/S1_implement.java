/*
* problem- implementation of stack using linked list
* time complexity- push-O(1), pop-O(1), peek-O(1)
* */
package stack;

public class S1_implement {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data= data;
            next=null;
        }
    }
    static class stack{
        public static node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            node newnode=new node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            return top;
        }
    }

    public static void main(String[] args) {
        stack s= new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(stack.head.data);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}

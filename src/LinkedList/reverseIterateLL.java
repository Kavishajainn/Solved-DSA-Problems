/*
* problem-- reverse a linked list using iteration, recursion
*/
package LinkedList;

public class reverseIterateLL {
    private int size;
    Node head;
    reverseIterateLL(){
        size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add -- first,last TC-O(1), SC-O(1)
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


    //add last TC-O(n), SC-O(1)
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next= newNode;
    }


    //print list TC-O(n), SC-O(1)
    public void printList(){
        if(head== null){
            System.out.println("list is empty! ");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first  TC-O(1), SC-O(1)
    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last   TC-O(n) SC-O(1)
    public void deleteLast(){
        if(head== null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    //get size of list TC-O(1) SC-O(1)
    public int getSize(){

        return size;
    }
    //reverse of list via iteration   TC-O(n) SC-O(1)
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node preNode= head;
        Node currNode= head.next;
        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next=preNode;

            //update
            preNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=preNode;
    }

    //reverse of list via recursion    TC-O(n), SC-O(n)
    public Node reverseRecursive(Node head){
        if(head== null || head.next==null){
            return head;
        }
        Node newHead= reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {

        reverseIterateLL list=new reverseIterateLL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
        list.reverseIterate();
        list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}

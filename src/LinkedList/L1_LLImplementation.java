/*
* problem-- implementation of linkedList
*/
package LinkedList;
public class L1_LLImplementation {
    Node head;
    private int size;

    L1_LLImplementation(){
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

    //ad741d -- first,last/963.-p[
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


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


    //print list
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

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
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

    public int getSize(){

        return size;
    }
    public static void main(String[] args) {
        L1_LLImplementation list=new L1_LLImplementation();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
         list.addLast("list");
         list.addFirst("this");
         list.printList();
        System.out.println(list.getSize());
    }
}

/*
* problem-- has cycle in LL and also delete cycle using floyd algo
* */
package LinkedList;

public class L6_hasCycle {
    Node head;
    private int size;

    L6_hasCycle(){
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

    //find cycle
    public boolean hasCycle(Node head){
        if(head==null){
            return false;
        }
        Node hare=head;
        Node turtle=head;

        while(hare != null && hare.next != null){
            hare= hare.next.next;
            turtle=turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }

    //removing cycle
    public void removeCycle(){
        if(head==null || head.next==null){
            return;
        }
        Node hare=head;
        Node turtle=head;
        //meeting inside the cycle
        while(hare != null && hare.next!= null){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare== turtle){
                break;
            }
        }
        //find starting point of cycle
        turtle = head;
        Node prev= null;
        while(turtle != hare){
            prev= hare;
            hare=hare.next;
            turtle=turtle.next;
        }
        //remove the cycle
        prev.next=null;
    }
    public static void main(String[] args) {
        L6_hasCycle list= new L6_hasCycle();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        //create a cycle
        list.head.next.next.next.next.next= list.head.next.next;
        if(list.hasCycle(list.head)==true ){
            System.out.println("cycle exists: " + list.hasCycle(list.head));
            list.removeCycle();
            System.out.println("list after removing cycle!");
            list.printList();
        }
        else{
            System.out.println("cycle don't exist!");
            list.printList();
        }
    }
}

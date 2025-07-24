/*
* problem-- given linked list is palindrome or not
* approach-- find middle of list -> reverse half LL -> compare both list
*/
package LinkedList;

public class L5_LLisPalindrome {
    Node head;
    private int size;

    L5_LLisPalindrome(){
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

    // palindrome or not
    public Node reverse(Node head){
        Node prev=null;
        Node curr= head;
        while(curr != null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node findMiddle(Node head){   //hare-turtle approach
        Node hare=head;
        Node turtle=head;
        while(hare.next != null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(Node head){
        if(head==null || head.next== null){
            return true;
        }
        Node middle=findMiddle(head);
        Node secondHalfOfStart= reverse(middle.next);
        middle.next=null;  //cut the connection

        Node firstHalfStart=head;
        while(secondHalfOfStart !=null){
            if(!firstHalfStart.data.equals(secondHalfOfStart.data)){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfOfStart=secondHalfOfStart.next;
        }
        return true;
    }


    public static void main(String[] args) {
        L5_LLisPalindrome list=new L5_LLisPalindrome();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("2");
        list.addLast("1");
        System.out.println(list.isPalindrome(list.head));

    }
}

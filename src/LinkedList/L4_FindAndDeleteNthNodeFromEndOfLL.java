/*
* problem-- remove Nth Node from back
* link-- https://leetcode.com/problems/remove-nth-node-from-end-of-list/
*/

package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class L4_FindAndDeleteNthNodeFromEndOfLL {
    Node head;
    private int size;

    L4_FindAndDeleteNthNodeFromEndOfLL(){
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
    public Node removeNthNode(Node head,int n){
        if(head.next==null){
            return null;
        }
        int size=0;
        Node curr=head;
        while(curr != null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int indexToSearch=size-n;
        Node prev=head;
        int i=1;
        while(i<indexToSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        L4_FindAndDeleteNthNodeFromEndOfLL list= new L4_FindAndDeleteNthNodeFromEndOfLL();
        System.out.println("give no of node, you want to delete");
        int n=sc.nextInt();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        if(n> list.getSize()){
            System.out.println("invalid value of N");
            return;
        }
        Node head = list.removeNthNode(list.head,n);
        list.printList();
    }
}

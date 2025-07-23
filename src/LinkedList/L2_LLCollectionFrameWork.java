/*
* problem-- implement of linkedList using collection Framework */
package LinkedList;
import java.util.*;
public class L2_LLCollectionFrameWork {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //add method
        list.addFirst("a");
        list.addFirst("this");
        list.addLast("man in");
        list.addFirst("hey");
        System.out.println(list);
        System.out.println(list.size());//getting size

        //another way of print list
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("null");

        //delete method
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println( list);


    }
}

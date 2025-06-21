/*
* problem-- insert an element in an array
* time complexity-- O(n)*/
package Arrays;
import java.util.Scanner;

public class A7_insertingAnElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int a=sc.nextInt();
        int[] arr=new int[50];
        System.out.println("enter the value of array: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value for insert: ");
        int insert=sc.nextInt();
        System.out.println("enter position: ");
        int pos=sc.nextInt();
        if(pos<= arr.length) {
            for(int i=a+1;i>pos-1;i--){
                arr[i]=arr[i-1];
            }
            arr[pos-1]=insert;
            a++;
        }
        else{
            System.out.println("invalid position! ");
        }
        System.out.println("array after insertion on an element ");
        for(int i=0;i<a;i++){
            System.out.println("element on position "+i+" is: "+arr[i]);
        }
    }
}

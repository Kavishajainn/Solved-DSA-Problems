  /*
   * problem-- delete an element in an array
   * time complexity-- O(n)*/
package Arrays;

import java.util.Scanner;

public class A8_deletingAnArray {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the length of array: ");
            int a=sc.nextInt();
            int[] arr=new int[50];
            System.out.println("enter the value of array: ");
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter position for deletion: ");
            int pos=sc.nextInt();
            if(pos<=a) {
                for(int i=pos-1;i<a;i++){
                    arr[i]=arr[i+1];
                }
                a--;
            }
            else{
                System.out.println("invalid position! ");
                System.exit(0);
            }
            System.out.println("array after deleting an element ");
            for(int i=0;i<a;i++){
                System.out.println("element on position "+i+" is: "+arr[i]);
            }
        }
}

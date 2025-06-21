/*
* problem--copying an array
* time complexity-- O(n)
*/
package Arrays;
import java.util.*;
public class A9_copyingAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of first array");
        int a=sc.nextInt();
        //first array
        int[] arr=new int[a];
        System.out.println("enter value of first element: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        //copy array in another array
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        //elements of second array
        System.out.println("element of second array is: ");
        for(int i=0;i<arr1.length;i++){
            System.out.println("element of position "+i+" is: "+ arr1[i]);
        }
    }
}

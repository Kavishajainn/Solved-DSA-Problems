package Arrays;
import java.util.*;
public class A1_1D_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter the value of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("your values of array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("enter value at index "+i+"is: "+ arr[i]);
        }
    }
}

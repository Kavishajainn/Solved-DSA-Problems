/*
* problem-- reverse copying an array
* time complexity-- O(n)*/
package Arrays;

import java.util.Scanner;

public class A10_reverseCopyingAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of first array");
        int a=sc.nextInt();
        //first array
        int[] arr=new int[a];
        System.out.println("enter value of first array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //copy array in another array
        int[] arr1=new int[arr.length];
        //method 1--using two variable
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
                arr1[j]=arr[i];
        }

        //method 2--using one variable
//        for(int i=0;i<arr.length;i++){
//            arr1[i]=arr[arr.length-1-i];
//        }

        //elements of second array
        System.out.println("element of second array is: ");
        for(int i=0;i<arr1.length;i++){
            System.out.println("element of position "+i+" is: "+ arr1[i]);
        }
    }
}

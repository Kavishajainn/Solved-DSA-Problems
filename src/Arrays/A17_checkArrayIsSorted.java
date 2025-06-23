/*
* problem-- check if an array is sorted
* link-- https://takeuforward.org/data-structure/check-if-an-array-is-sorted/
* time complexity-- O(n)
* space complexity--O(1)*/

package Arrays;

import java.util.Scanner;

public class A17_checkArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter the value of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //check if array is sorted
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                System.out.println("not sorted!");
                System.exit(0);
            }
        }
        System.out.println("array is sorted! ");
    }
}

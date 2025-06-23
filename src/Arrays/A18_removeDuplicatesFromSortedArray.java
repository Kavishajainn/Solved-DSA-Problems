/*
* problem-- remove duplicates from sorted array
* link--https://takeuforward.org/plus/dsa/problems/remove-duplicates-from-sorted-array
* time complexity-- O(n)
* space complexity-- O(n)*/
package Arrays;

import java.util.Scanner;

public class A18_removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter sorted value in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(i>0 && arr[i]<arr[i-1]) {
                System.out.println("please enter value in sorted order!");
                i--;
            }
        }
        //print original array
        System.out.println("your values of array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // removing duplicates
        int[] temp=new int[a];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
           if(arr[i] != arr[i+1]){
               temp[j++]=arr[i];
           }
        }
        temp[j++]=arr[a-1]; //add the last element

        // Print array after removing duplicates
        System.out.println("After removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }

}

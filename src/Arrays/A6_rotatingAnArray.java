/*
* problem--rotating an array in left and right side
* time complexity--O(n) */
package Arrays;

import java.util.Scanner;

public class A6_rotatingAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter the value of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //Left rotation by 1

        int temp=arr[0];
        int[] arr2=new int[a];
        for(int i=0;i<arr2.length-1;i++){
            arr2[i]=arr[i+1];
        }
        arr2[arr2.length-1]=temp;
        System.out.println("rotating an array in left side");
        for (int i=0;i< arr2.length;i++){
            System.out.println("at index "+i+" element is: "+arr2[i]);
        }

        //rotating on a right side

        int temp2=arr[arr.length-1];
        int[] arr3=new int[a];
        for(int i=arr3.length-1;i>0;i--){
            arr3[i]=arr[i-1];
        }
        arr3[0]=temp2;
        System.out.println("rotating an array in right side");
        for (int i=0;i< arr3.length;i++){
            System.out.println("at index "+i+" element is: "+arr3[i]);
        }
    }
}

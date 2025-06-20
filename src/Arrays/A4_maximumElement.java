/*
* problem-- find maximum element in array
* time complexity-- o(n)*/
package Arrays;

import java.util.Scanner;

public class A4_MaximumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter the value of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }
        }
        System.out.println("Maximum element is: "+max+" at index "+idx);
    }
}

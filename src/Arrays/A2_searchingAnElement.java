/*
* problem-- linear search
* time complexity -- o(n)*/
package Arrays;

import java.util.Scanner;

public class searchingAnElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter the value of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give no for search");
        int b=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                System.out.println("found at index: "+ i );
                System.exit(0);
            }
        }
        System.out.println("not found!");
    }
}

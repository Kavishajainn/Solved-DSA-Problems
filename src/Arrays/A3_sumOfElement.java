/*
* problem-- sum of all element
* time complexity-- O(n)  */
package Arrays;

import java.util.Scanner;

public class sumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter the value of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("sun of all element is : "+ sum);
    }
}

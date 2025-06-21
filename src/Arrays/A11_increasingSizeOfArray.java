/*
* problem-- increasing size of array
* logic-- step 1:copy the element from A to B
           step 2:A referring to B
           step 3:B will be null
*time complexity-- O(n)*/
package Arrays;

import java.util.Scanner;

public class A11_increasingSizeOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //original array
        int[] a={8,6,10,9,2};
        System.out.println("Original length of array is: "+ a.length);
        //create new array of large size
        int[] b=new int[2*a.length];
        //copy an array
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        //a now refer to b
        a=b;
        //remove reference of b
        b=null;
        //print new array length and element
        System.out.println("new length of array after increasing size: "+a.length);
        System.out.println("element of second array is: ");
        for(int i=0;i<a.length;i++){
            System.out.println("element of position "+i+" is: "+ a[i]);
        }
        sc.close();
    }
}

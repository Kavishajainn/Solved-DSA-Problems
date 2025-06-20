/*
* problem--Find second largest element in an array
* time complexity-- o(n)*/
package Arrays;

import java.util.Scanner;

public class A5_SecondLargestElement {
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
            int maxIdx=0;
            int secMax=0;
            int secMaxIdx=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    secMax=max;
                    secMaxIdx=maxIdx;
                    max=arr[i];
                    maxIdx=i;
                } else if (arr[i]>secMax) {
                    secMax=arr[i];
                    secMaxIdx=i;
                }
            }
            System.out.println("maximum element is: "+max+" at index "+maxIdx);
            System.out.println("second largest element is: "+secMax+" at index "+secMaxIdx);
        }
}

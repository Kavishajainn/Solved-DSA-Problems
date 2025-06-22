/*
* problem-- create 2D array
* time complexity-- O(n*m)
* space complexity-- O(n*m)*/
package Arrays;
import java.util.*;
public class A12_2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //initialization method 1
        //  int[][] arr= new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

       //initialization method 2
        System.out.println("give size of row of array: ");
        int a=sc.nextInt();
        System.out.println("give size of column of array");
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        //take input from user
        System.out.println("enter elements of array: ");
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j]=sc.nextInt();
           }
       }

        System.out.println("elements is");

        //printing array using for loop
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }


        //printing array using foreach loop
        for(int[] x:arr){
            for(int y:x){
                System.out.print(y+" ,");
            }
            System.out.println();
        }
    }
}

/*
* problem-- multiplying 2 matrices
* time complexity--O(a*b*c) --3 loops->rows * shared dim * cols
* space complexity-- O(ab+bc+ac) */
package Arrays;

import java.util.Scanner;

public class A15_multiplying2Matrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give size of row of first array: ");
        int a=sc.nextInt();
        System.out.println("give size of first array's column and second array's row: ");
        int b=sc.nextInt();
        System.out.println("give size of column of second array: ");
        int c=sc.nextInt();
        int[][] arr=new int[a][b];
        int[][] arr1=new int[b][c];

        //take element from user for first array
        System.out.println("enter elements of first array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //take element from user for second array
        System.out.println("enter elements of second array: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        //printing elements of 1st array
        System.out.println("elements of 1st array");
        for(int[] x:arr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();

        //printing elements of 2nd array
        System.out.println("elements of 2nd array");
        for(int[] x:arr1){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();

        //create new array for store result
        int[][] result=new int[a][c];

        //multiplication of both array
        System.out.println("after multiply both array: ");
        for(int i =0;i<a;i++){
            for(int j=0;j<c;j++){
                result[i][j]=0;
                for(int k=0;k<b;k++) {
                    result[i][j] = result[i][j]+arr[i][k]*arr1[k][j];
                }
            }
        }

        //printing elements of result array
        System.out.println("elements of result array");
        for(int[] x:result){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

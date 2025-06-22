/*
* problem: adding 2 matrices
* time complexity--O(n*m)
* space complexity-- O(n*m) */
package Arrays;


import java.util.Scanner;

public class A14_adding2Matrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give size of row of both array: ");
        int a=sc.nextInt();
        System.out.println("give size of column of both array");
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        int[][] arr1=new int[a][b];

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
        int[][] result=new int[a][b];

        //addition of both array
        System.out.println("after adding both array: ");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                result[i][j]=arr[i][j]+arr1[i][j];
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

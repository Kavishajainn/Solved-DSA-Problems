/*
* problem--create jagged array
* time complexity--O(N) where N=sum of sizes of all rows
* space complexity--O(N)*/

package Arrays;
import java.util.*;
public class A13_jaggedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a;
        System.out.println("enter no of row");
        int k=sc.nextInt();
        a=new int[k][];
        //create jagged array
        System.out.println("enter size of each row: ");
        for(int j=0;j<a.length;j++){
            System.out.println("enter size of "+j+" row of array: ");
            a[j]=new int[sc.nextInt()];
        }

        //elements of jagged array
        System.out.println("enter elements of array");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }

        //print elements of array
        System.out.println("elements of jagged array is: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

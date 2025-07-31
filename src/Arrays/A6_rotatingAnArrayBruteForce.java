/*
* problem-- rotating an array using brute force
* time complexity-- O(n*d)
* space complexity-- O(1)*/
package Arrays;

public class A6_rotatingAnArrayBruteForce {
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        if(d>n){
            d=d%n;
        }
        for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=2;
        rotateArr(arr,d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}

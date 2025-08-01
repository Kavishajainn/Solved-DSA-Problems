package Arrays;

public class A6_rotatingAnArrayInPlace {
    public static void reverse(int[] arr, int start, int end){
        while(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0, arr.length-1);
    }
    public static void main(String[] args) {
        int d=2;
        int[] arr={1,2,3,4,5};
        rotate(arr,d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}

//find second maximum element in an array
import java.util.Scanner;
public class array1 {
    //find second maximum element in an array
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter array length");
            int a= sc.nextInt();
            int[] marks;
            marks = new int[a];
            System.out.println("you enter array length is : "+marks.length);
            for (int i=0;i< marks.length;i++) {
                System.out.println("enter number");
                marks[i] = sc.nextInt();
            }
            int max1=0;
            int max2=0;
            int indx=0;
            int indx2=0;
            for(int i=0;i<marks.length;i++){
                if(marks[i]>=max1){
                    max2=max1;
                    max1=marks[i];
                    indx2=indx;
                    indx=i;
                }
                else{
                    if(marks[i]>=max2){
                        max2=marks[i];
                        indx2=i;
                    }
                }
            }
            System.out.println("internet ");
            System.out.println("max element is: "+max1+" at index "+ indx);
            System.out.println("second largest element is "+ max2 + " at index "+ indx2);
        }
}


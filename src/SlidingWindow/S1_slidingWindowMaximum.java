/*You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. */

package SlidingWindow;
import java.util.*;
public class S1_slidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k){
        if(nums==null || k==0){
            return new int[0];//direct empty array return like-- return 3;
        }

        int n=nums.length;
        int[] result=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();  //create deque

        for(int i=0;i<n;i++){

            // remove index that are out of this window
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            //remove values smaller than current element
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            //add current index
            dq.offerLast(i);    //doubt
            //store max for windows starting from i>=k-1
            if(i>=k-1){
                result[i-k+1]= nums[dq.peekFirst()];
            }
        }
        return result;

    }
   public static void main(String[] args) {
       S1_slidingWindowMaximum obj=new S1_slidingWindowMaximum();
       int[] nums={1,3,-1,-3,5,3,6,7};
       int k=3;
       System.out.println(Arrays.toString(obj.maxSlidingWindow(nums,k)));
    }
}

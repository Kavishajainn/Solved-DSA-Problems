/*
* problem-- remove duplicates from sorted array
* link-- https://takeuforward.org/plus/dsa/problems/remove-duplicates-from-sorted-array
* logic-- using two pointer
* time complexity-- O(n)
* space complexity-- O(1)*/
package Arrays;

public class A19_removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){
        if(nums.length == 0)
            return 0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;// 'i' is index of last unique value
    }
    public static void main(String[] args) {
        int[] nums={0,0,3,3,5,6};
        int k=removeDuplicates(nums);
        System.out.println("k= "+k);
        System.out.println("Modified array: ");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

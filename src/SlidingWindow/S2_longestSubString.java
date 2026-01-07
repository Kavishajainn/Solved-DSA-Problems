/*length of longest substring in a String*/
package SlidingWindow;
import java.util.*;

public class S2_longestSubString {

    public int Longestsubstring(String s){
        if(s.isEmpty()){
            return 0;
        }
        int res=0;
        int left=0;
        HashMap<Character, Integer> map=new HashMap<>();
        char[] arr=s.toCharArray();      //convert string into array
        for(int right=0;right< arr.length;right++){
            int idx=map.getOrDefault(arr[right],-1);

            if(idx != -1 && idx>=left){
                left=idx+1;
                map.put(arr[right],right);
                res=Math.max(res,right-left+1);
            }else {
                map.put(arr[right], right);
                res=Math.max(res,right-left+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        S2_longestSubString ss = new S2_longestSubString();
        String s= "abcabcbb";
        System.out.println(ss.Longestsubstring(s));
    }
}

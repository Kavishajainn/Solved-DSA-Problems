/*print longest substring of a String*/
package SlidingWindow;

import java.util.HashMap;

public class S3_longestSubstringReturn {
    public void printString(char[] s,int start,int maxLen){
        for(int i=start;i<start+maxLen;i++){
            System.out.print(s[i]+",");
        }
        System.out.println();
        System.out.println("maximun length of string is "+maxLen);
    }
    public void Longestsubstring(String s){
        if(s.isEmpty()){
            return ;
        }
        int res=0;
        int maxLen=0;
        int start=0;
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

                if(right-left+1>maxLen){
                    maxLen=right-left+1;
                    start=left;
                }

            }

        }
        printString(arr,start,maxLen);
    }

    public static void main(String[] args) {
        S3_longestSubstringReturn ss = new S3_longestSubstringReturn();
        String s= "abcabcbb";
        ss.Longestsubstring(s);
    }
}

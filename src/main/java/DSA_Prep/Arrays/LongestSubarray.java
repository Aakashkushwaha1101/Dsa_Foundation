package DSA_Prep.Arrays;

import java.util.HashMap;

public class LongestSubarray {
    public static void main(String[] args) {
        // 0 is edge case need to handle int[] arr={1,2,3,1,0,0,1,1,1,4,2,3}; maxLength=5;
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        longestSubarray(arr,k);
    }
    static void longestSubarray(int[] arr,int k){
        HashMap<Integer,Integer> hash=new HashMap<>();
        int maxSum=0 , maxLength=0;
        for(int i=0; i<arr.length; i++){
            maxSum +=arr[i];
            if(maxSum==k){
                maxLength=Math.max(maxLength,i+1);
            }
            if(hash.containsKey(maxSum-k)){
                maxLength=Math.max(maxLength,i- hash.get(maxSum-k));
            }
            if(!hash.containsKey(maxSum-k)){
                hash.put(maxSum,i);
            }
        }
        System.out.println("maxLength :"+maxLength);

    }
}

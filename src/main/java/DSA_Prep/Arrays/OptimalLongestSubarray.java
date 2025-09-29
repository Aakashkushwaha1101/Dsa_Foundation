package DSA_Prep.Arrays;

public class OptimalLongestSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,3,3};
        int[] arr2={1,2,3,1,1,1,1,1,1,3,3};
        int k=6;
        System.out.println("arr length " +optimal(arr,k));
        System.out.println("arr2 length "+optimal(arr2,k));
    }

    // using two pointer approach
    static int optimal(int[] arr,int k){
        int left=0 ,right=0;
        int maxSum=arr[0] , maxLength=0;
        while(right<arr.length){
            while(maxSum>k){
                maxSum-=arr[left];
                left++;
            }
            if(maxSum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
            if(right< arr.length){
                maxSum+=arr[right];
            }
        }
        return maxLength;
    }
}

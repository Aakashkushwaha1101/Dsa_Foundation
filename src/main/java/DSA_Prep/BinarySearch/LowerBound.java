package DSA_Prep.BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr={1,2,3,35,8,8,10,10,11};
        LowerBound lb=new LowerBound();
        int x=10;
        lb.lowerBound(arr,x);

    }
    void lowerBound(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;
        int count=0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid]>=x){
                ans=mid;
                count++;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        System.out.println(ans);
        System.out.println(count);
    }

}

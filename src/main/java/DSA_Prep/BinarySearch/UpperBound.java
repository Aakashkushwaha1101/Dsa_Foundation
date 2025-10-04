package DSA_Prep.BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr={2,3,6,7,8,8,11,11,11,12};
        UpperBound ub=new UpperBound();

        int x=8;
        ub.upperBound(arr,x);

    }
    void upperBound(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        System.out.println(ans);
    }

}

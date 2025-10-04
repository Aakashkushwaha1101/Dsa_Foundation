package DSA_Prep.BinarySearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr={2,3,6,7,8,8,11,11,11,12};
        BinarySearchAlgo ub=new BinarySearchAlgo();
        int target=14;
        ub.bSearch(arr,target);

    }
    void bSearch(int[] nums, int x) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid]==x){
                System.out.println("target found at index  "+mid);
                return;
            }
            else if(nums[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        System.out.println("Target not found");

    }

}

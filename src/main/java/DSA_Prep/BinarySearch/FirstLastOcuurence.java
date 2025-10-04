package DSA_Prep.BinarySearch;

public class FirstLastOcuurence {
    public static void main(String[] args) {
        int arr[]={2,8,8,8,8,8,11,13};
        int target=8;
        int first=firstOccurence(arr,target);
        int last=lastOccurence(arr,target);
//        return new int[] {first,last};
        System.out.println("first is "+first +" last is "+last);
    }
    static int firstOccurence(int[] nums,int target){
        int low=0 , high= nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            } else if (nums[mid]<target) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    static int lastOccurence(int[] nums,int target){
        int low=0 , high= nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            } else if (nums[mid]<target) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }

}

package DSA_Prep.Arrays;

public class Two2sum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=14;
        twoSum(arr,target);
    }
    static void twoSum(int[] arr,int target){

        for (int j=0; j<arr.length; j++){
            int i;
            int sum=0;
            for(i=0; i< arr.length; i++){
//                if(i==j){
//                    continue;
//                }
                sum=arr[j]+arr[i];
                if(sum==target){
                    System.out.println(j+" "+i);
                }
            }


        }

    }
}

package DSA_Prep.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        // bruet force approach--> first approach is sort the array and compare with max return element
        // but complexity in worst case O(nlogn)<-sorting * n <-- traverse for compare with max
        int [] arr={3,2,6,8,9,11,45,32,1,5,2};
        int [] result=maximum(arr);

        System.out.println(" largest is ;"+ result[0] );
        System.out.println(" secondlargest is;"+ result[1]);


    }
    // optimal solution using one looop time complexity is O(n)
    static int[] maximum(int[] arr){
        int max=arr[0];   // largest element
        int secondlarge=-1; //secondlargest element
        for (int j : arr)
            if (max < j) {
                secondlarge = max;
                max = j;
            } else if (j < max && secondlarge < j) {
                secondlarge = j;
            }
        // better approach time complexity O(n+n)=O(2n)
//        int secondlarge=-1; //secondlargest element
//        for(int i=0 ; i< arr.length; i++){
//            if(arr[i]<max && secondlarge<arr[i]){
//                secondlarge=arr[i];
//            }
//
//        }
        return new int[] {max,secondlarge};
    }
}

package DSA_Prep.Arrays;

import java.util.ArrayList;
import java.util.Collections;
//question-Arrays optimal way
// element add in leaders array where from the right of that element no element is greater than that;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6,4};
        leader(arr);

    }
    static void leader(int[] arr){
        ArrayList<Integer> leaders=new ArrayList<>();
        int n= arr.length ,maxim=Integer.MIN_VALUE;
        for (int i=n-1; i >=0 ; i--){
            if(arr[i]>maxim){
                maxim=arr[i];
                leaders.add(arr[i]);
            }
        }
//        Collections.sort(leaders);
        System.out.println(leaders);
    }
}

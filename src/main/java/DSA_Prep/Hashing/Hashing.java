package DSA_Prep.Hashing;

import java.util.Arrays;

public class Hashing {
    public static void main(String [] args){
        int[] hash={1,2,3,3,7,4,9,4};
        int[] numberSearch={3,4,12};


        // To find maximum element in array
        int maxValue= Arrays.stream(numberSearch).max().getAsInt();
//      System.out.println(" maxValue : " + Arrays.stream(numberSearch).max().getAsInt());

        int[] hashSize=new int[maxValue+1];
        for (int i=0 ;i<hash.length;i++){
            hashSize[hash[i]] ++;             // prestoring
        }
        for (int i=0;i<numberSearch.length;i++){  // fetching
            System.out.println(" count of  "+ numberSearch[i] +" is :" + hashSize[numberSearch[i]]);
        }
    }

}
//  Character hashing is also possible;

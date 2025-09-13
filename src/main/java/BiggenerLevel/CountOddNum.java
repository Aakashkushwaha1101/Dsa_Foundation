package BiggenerLevel;

import java.util.Scanner;

public class CountOddNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter number :");
        int number= scn.nextInt();
        CountOddNum.countOdd(number);


    }
    static void countOdd(int number){
        int oddCount=0;
        while (number !=0){
            int remainder=number%10;

            if (remainder%2 !=0){
                oddCount++;
            }
            number /=10;

        }
        System.out.println(oddCount);
    }
}

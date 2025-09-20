package DSA_Prep.Recursion;

import java.util.Scanner;

public class Fabonacc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" enter place value that fabonacci digit  you find : ");
        int n=scanner.nextInt();
        int digit=fabonacciSeries(n);
        System.out.println(" fabonacci series up to "+n +" is :"+ digit);

    }
    // time ccomplexity O(2^n) --> bhut bekar hai jo ki
    // so we use dp (dynamic programming ) --> to reduce complexity

    static int fabonacciSeries(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int n1=fabonacciSeries(n-1) ;
        int n2=fabonacciSeries(n-2);
        int sum=n1+n2;
        return sum;
    }
}

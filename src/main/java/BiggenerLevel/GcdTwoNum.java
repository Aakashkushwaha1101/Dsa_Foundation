package BiggenerLevel;

import java.util.Scanner;

public class GcdTwoNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter num1");
        int a=scn.nextInt();
        System.out.println("enter num2");
        int b=scn.nextInt();
        int gcd=1;
        for(int i=1 ; i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }

        }
        System.out.println(" gcd is :" + gcd);

    }

}

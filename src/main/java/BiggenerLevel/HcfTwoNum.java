package BiggenerLevel;

import java.util.Scanner;
// gcd and hcf both are same gcd (greatest common factor),hcf(highest common factor)

public class HcfTwoNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter num1");
        int a = scn.nextInt();
        System.out.println("enter num2");
        int b = scn.nextInt();
        int hcf = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }

        }
        System.out.println("Hcf is :"+hcf);
    }
}

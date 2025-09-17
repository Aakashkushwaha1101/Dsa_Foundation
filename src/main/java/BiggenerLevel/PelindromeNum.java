package BiggenerLevel;

import java.util.Scanner;

public class PelindromeNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter num :");
        int num = scn.nextInt();

        int originalNum = num;
        int reverse = 0;
        for (int i = 0; i < num; i++) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (originalNum != reverse) {
            System.out.println();
        }
        System.out.println("yes pelindrome number ✅");
    }

}

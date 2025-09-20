package DSA_Prep.Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" enter text to check if it palindrome or not");
        String str=scanner.nextLine();

        // function call
        System.out.println( isPalindrome(0,str));

    }
    static boolean isPalindrome(int i,String str){
        //string length ke half tk check krega if half is matched the return true
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        //recursive call
        return    isPalindrome(i+1,str);



    }
}

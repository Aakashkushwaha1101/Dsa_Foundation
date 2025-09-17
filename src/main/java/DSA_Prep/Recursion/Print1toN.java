package DSA_Prep.Recursion;

public class Print1toN {
    public static void main(String[] args) {
        printN(10);
    }
    static void printN(int n){
        if(n==0) {
            return;
        }
        printN(n-1);
        System.out.println(n);
    }
}

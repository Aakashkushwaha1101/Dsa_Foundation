package DSA_Prep.Recursion;

public class Print1toN {
    public static void main(String[] args) {
        System.out.println("backtracking");
        printN(10);
        System.out.println();
        System.out.println( "------------------------------------------------");
        System.out.println("without backtrack");
        usingBacktrack(1,10);
    }
    static void printN(int n){
        if(n==0) {
            return;
        }
        printN(n-1);

        System.out.print(n+",");

    }

    // without using backtracking method
    static void usingBacktrack(int i , int n){
        if(i>n){
            return ;
        }
        System.out.print(i+",");
        usingBacktrack(i+1,n);
    }
}

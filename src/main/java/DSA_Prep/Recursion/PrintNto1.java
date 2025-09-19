package DSA_Prep.Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
       //printN(5);
        usingBacktrack(1,10);
    }
//    static void printN(int n){
//        if(n==0) {
//            return;
//        }
//        System.out.println(n);
//        printN(n-1);
//    }
    static void usingBacktrack(int i , int n){
        if(i>n){
            return;
        }

        usingBacktrack(i+1,n);
        System.out.print(i+" , ");
    }
}

package DSA_Prep.Recursion;

public class factorial {
    public static void main(String[] args) {
        int calling=factorial(5);
        System.out.println(calling);
    }

    //function using return statement
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}

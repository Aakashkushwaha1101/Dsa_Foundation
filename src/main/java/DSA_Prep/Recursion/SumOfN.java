package DSA_Prep.Recursion;

public class SumOfN {
    public static void main(String[] args) {
        sum(0,10);
        System.out.println("---------------------------------------------");
        System.out.println(functionalSum(10));

    }
    //parameterized sum
    static void sum(int Sum,int n){
        if(n==0){
            System.out.println(Sum);
            return;
        }
        sum(Sum+n,n-1);

    }
    // functional sum
    static int functionalSum(int n){
        if(n==0){
            return 0;
        }
        return n+functionalSum(n-1);
    }
}

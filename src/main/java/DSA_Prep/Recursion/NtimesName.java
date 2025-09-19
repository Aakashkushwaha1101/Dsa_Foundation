package DSA_Prep.Recursion;

public class NtimesName {
//    static void printNname(String name, int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(name);
//        printNname(name, n - 1);
//    }
//
//    public static void main(String[] args) {
//        printNname("Aakash", 12);
//
//    }


//second Method to print name n times

static void printNname(int i ,int n){
    if(i>n){
        return ;
    }
    System.out.println("Aakassh");
    printNname(i+1,n);
}
    public static void main(String[] args) {
        printNname(0,12);

    }

}

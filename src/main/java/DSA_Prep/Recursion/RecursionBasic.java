package DSA_Prep.Recursion;

public class RecursionBasic {
    // a function call it self until it hit the base condition ,where function call stop.\
    // without base condition <-- it arises stack overflow because it will run infinitly function call itself continuos
    /*static void func(){
        System.out.println("Recursion");
        func();
    }
    public static void main(String[] args) {
        func();

    }*/

    // fuction with base condition
    static int count=0;
    static void func(){
        if(count==5){
            return;
        }
        System.out.println(count);
        count++;
        func();
    }
    public static void main(String[] args) {
        func();

    }

}

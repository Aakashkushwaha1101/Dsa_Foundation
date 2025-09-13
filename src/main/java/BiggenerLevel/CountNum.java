package BiggenerLevel;

public class CountNum {
    public static void main(String[] args) {
        int num=4365;
        int count=0;
//        System.out.println(n/10);
        while (num !=0){
            num/=10;
            count++;

        }
        System.out.println("number of digits is :" +count);
    }
}

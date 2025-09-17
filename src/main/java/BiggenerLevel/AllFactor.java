package BiggenerLevel;

import java.sql.SQLOutput;
import java.util.*;

public class AllFactor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" enter the number :");
        int num= scanner.nextInt();
        List<Integer> ls=new ArrayList<>();
        for(int i=1; i*i<=num ; i++){
            if(num%i==0){
                ls.add(i);
                ls.add(num/i);
            }
        }
        Collections.sort(ls);
        for (int i=0 ; i<ls.size();i++){
            System.out.print(ls.get(i)+",");
        }

    }
}

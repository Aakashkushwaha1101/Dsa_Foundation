package BiggenerLevel;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter year :");
        int year= scn.nextInt();
        LeapYear yr=new LeapYear();
        yr.isleapyear(year);

    }
    void isleapyear(int year){

        boolean isyearleap=false;
        if(year%400==0){
            isyearleap=true;

        } else if (year%4==0 && year%100!=0) {
            isyearleap=true;

        }
        if (isyearleap){
            System.out.println(year +" is leap year");

        }
        else{
            System.out.println(year +" is not leap year");
        }
    }
}

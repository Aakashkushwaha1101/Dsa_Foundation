package BiggenerLevel;

import java.util.Scanner;

public class Floatproduct {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        /*System.out.println(" enter f1 number :" );
        float f1= scn.nextFloat();
        System.out.println(" enter f2 number :" );
        float f2= scn.nextFloat();
        float result=f1*f2;
        System.out.println("product of f1 and f2:" +result);*/

        //=============================================================
        //perimeter of a ractangle A +B+C+D
        /*System.out.println("enter side A :");
        int A=scn.nextInt();
        System.out.println("enter side B :");
        int B=scn.nextInt();
        System.out.println("enter side C :");
        int C=scn.nextInt();
        System.out.println("enter side D :");
        int D=scn.nextInt();
        int peremeter=A+B+C+D;
        System.out.println("perimeter of ractangle : " +peremeter);*/

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // calculate area of triangle 1/2*Base*Height
        /*System.out.println("enter base of triangle :");
        Double b=scn.nextDouble();
        System.out.println("enter height of tringle:");
        Double h=scn.nextDouble();

        Double result= (0.5*b*h);
        System.out.println("Area of Triangle is :" +result);*/

        //========================================================================

        //calculate simple interest and compound interest p*r*t/100 and p*(1+r)*t/100
        System.out.println(" enter  the principal value :");
        float p= scn.nextFloat();
        System.out.println(" enter  the rate value :");
        float r= scn.nextFloat();
        System.out.println(" enter  the time value in year :");
        float t= scn.nextFloat();

        float s_i=(p*r*t)/100;

        float c_i=(p*(1+r)*t)/100;
        System.out.println(" simple interest value every year :" +s_i);
        System.out.println("compound interest is : "+c_i);

        //===================================================================
        //convert fahrenheit to celsius


        System.out.println(" enter  the temperature in fahrenheit  :");
        float f= scn.nextFloat();

        float degree_celsius=(f-32)*5/9;

        System.out.println(" temperature in degree celsius :"+ degree_celsius);


    }
}
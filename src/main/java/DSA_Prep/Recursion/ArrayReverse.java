package DSA_Prep.Recursion;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {

        // to take input of array from user
        int[] arr=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Elements in array : ");
        for(int k=0; k< arr.length; k++){
            arr[k]=scanner.nextInt();
        }
        //intialization of parameters for recursion function call
        int i=0;
        int j= arr.length-1;
        reverse(i,j,arr);

        // To print reversed array
        for(int k=0; k< arr.length; k++){
            System.out.print(arr[k]+",");

        }

    }
    //Recursive function to reverse array
    static void reverse(int i,int j,int[] arr){
        if(i>=j){
            return;
        }
        swap(i,j,arr);
        reverse(i+1,j-1,arr);

    }
    //To perform swapping inside reverse function
    static int[] swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return arr;
    }
    // using one pointer it is also be done

    /* we take a i pointer value 0 , length of array
       and pass in recursive function

       in recursive call i ,n-i-1 pass krenge
       aur swaping perform krenge */
}

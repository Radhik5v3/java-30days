package Exceptions;
import java.util.Scanner;
public class arthematic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        int result=a/b;
        System.out.println("result"+result);
        }
        catch(ArithmeticException e){
            System.out.println("this is not divided by 0");
        }

    }
    
}

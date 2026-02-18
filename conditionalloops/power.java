package conditionalloops;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base number:");
        int base=sc.nextInt();
        System.out.println("enter the expo value:");
        int expo=sc.nextInt();
        double result=Math.pow(base, expo);
        System.out.println("the power of given number is"+result);
    }
    
}

package firstjavacode;
import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first num1:");
        double num1=sc.nextDouble();
        System.out.println("enter the second num2");
        double num2=sc.nextDouble();
        System.out.println("enter the operaters(+,-,*,/):");
        char op=sc.next().charAt(0);
        if(op=='+'){
            System.out.println("Result:"+(num1+num2));
        }
        else if(op=='-'){
           System.out.println("Result:"+(num1-num2)); 
        }
        else if(op=='*'){
            System.out.println("Result:"+(num1*num2));
        }
        else if(op=='/'){
            System.out.println("Result:"+(num1/num2));
        }
        else{
            System.out.println("invalied operters");
        }
    }
    
}

package firstjavacode;
import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rupee:");
        double rupee=sc.nextDouble();
        double rate=83.00;
        double USD=rupee/rate;
        System.out.println("the converted USD is:"+USD);

    }
    
}

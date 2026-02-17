package firstjavacode;
import java.util.Scanner;
public class Simpleintrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the p and t and r");
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int SI=(p*t*r)/100;
        System.out.println("Simple Intrest is :"+SI);
    }
    
}

package areasANDperimeter;
import java.util.Scanner;
public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the rectangle:");
        int  l=sc.nextInt();
        System.out.println("enter the breath of the rectangle");
        int b=sc.nextInt();
        double area =l*b;
        System.out.println("the area of the rectangle is:"+area);
    }
    
}

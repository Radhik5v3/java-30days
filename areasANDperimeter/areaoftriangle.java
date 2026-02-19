package areasANDperimeter;
import java.util.Scanner;
public class areaoftriangle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the height of the triangle:");
        int  h=sc.nextInt();
        System.out.println("enter the base of the triangle:");
        int b=sc.nextInt();
        double area=0.5*b*h;
        System.out.println("the area of the triangle is:"+area);
   }   
}

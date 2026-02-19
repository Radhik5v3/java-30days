package areasANDperimeter;
import java.util.Scanner;
public class areaofrhombus {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the d1 of the rhombus:");
        int  d1=sc.nextInt();
        System.out.println("enter the d2 of the rhombus:");
        int d2=sc.nextInt();
        double area=0.5*d1*d2;
        System.out.println("the area of the rhombus:"+area);
   }    
}

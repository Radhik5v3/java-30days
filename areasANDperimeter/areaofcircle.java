package areasANDperimeter;
import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radiius of the circle:");
        int  r=sc.nextInt();
        double pie=3.14;
        double area=r*pie;
        System.out.println("area of the circle:"+area);
    }
    
}

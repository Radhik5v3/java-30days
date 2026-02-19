package areasANDperimeter;
import java.util.Scanner;
public class perimeterofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radiius of the circle:");
        int  r=sc.nextInt();
        double pie=3.14;
        double perimeter=2*pie*r;
        System.out.println("the area of the circle is:"+perimeter);
    }
    
}

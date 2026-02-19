package areasANDperimeter;
import java.util.Scanner;
public class volumeofcylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the cylinder:");
         int  r=sc.nextInt();
        System.out.println("enter the height of the cone:");
        int h=sc.nextInt();
        double pie=3.14;
        double volume=pie*h*Math.pow(r, 2);
        System.out.println("the volume of the cylinder is:"+volume);

    }
    
}

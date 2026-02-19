package areasANDperimeter;
import java.util.Scanner;
public class volumeofsphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the sphere:");
        int  r=sc.nextInt();
        double pie=3.14;
        double volume=1.33*pie*Math.pow(r, 3);
        System.out.println("the volume of the sphere is:"+volume);
    }
    
}

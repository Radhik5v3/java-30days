package areasANDperimeter;
import java.util.Scanner;
public class perimeterofsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sides of the square:");
        int  side=sc.nextInt();
        int perimeter=4*side;
        System.out.println("the perimeter of the square is:"+perimeter);
    }
    
}
